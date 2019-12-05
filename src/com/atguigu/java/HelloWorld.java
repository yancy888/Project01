package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/*
快捷键的使用：
1 执行(run) alt+r
2 提示补全  alt+/
3 单行注释  ctrl+/
4 多行注释  ctrl+shift+/
5 向下复制一行 ctrl+alt+down
6 删除一行或选中行  ctrl+d
7 向下移动行 alt+down
8 向上移动行 alt+up
9 向下开始新的一行 shift+enter
10 向上开始新的一行 ctrl+shift+enter
11 如何查询源码 ctrl+鼠标/ctrl+shift+t
12 万能解错/生成返回值变量 alt+enter
13 退回前一个编辑的页面 alt+left
14 进入到下一个编辑的页面(针对于上条) alt+right
15 查看继承关系 F4
16 格式化代码 ctrl+shift+F
17 提示方法参数类型 ctrl+alt+/
18 复制代码 ctrl+c
19 撤销 ctrl+z
20 反撤销 ctrl+y
21 剪切 ctrl+x
22 粘贴 ctrl+v
23 保存 ctrl+s
24 全选 ctrl+a
25 选中数行，整体往后移动 tab
26 选中数行，整体往前移动 shift+tab
27 查看类的结构：类似于eclipse的outline ctrl+o
28 重构：修改变量名于方法名 alt+shift+r
29 大写转小写/小写转大写 ctrl+shift+y
30 生成构造器 alt+shift+s
31 查看文档说明 F2
32 收起所有的方法 alt+shift+c
33 打开所有方法 alt+shift+x
34 打开代码所在硬盘文件夹 ctrl+shift+x
35 生成try-catch等 alt+shift+z
36 局部变量抽取为成员变量 alt+shift+f
37 查找/替换(当前) ctrl+f
38 查找(全局) ctrl+h
39 查找文件 double Shift
40 查看类的继承结构图 ctrl+shift+u
41 查看方法的多层重写结构 ctrl+alt+h
42 添加到收藏 ctrl+alt+f
43 抽取方法 alt+shift+m
44 打开最近修改的文件 ctrl+E
45 关闭当前打开的代码栏 ctrl+w
46 关闭打开的所有代码栏 ctrl+shift+w
47 快速搜索类中的错误 ctrl+shift+q
48 选择要粘贴的内容 ctrl+shift+v
49 查找方法在哪里被调用 ctrl+shift+h
*/
public class HelloWorld {


    //这是单行注释

    private static int num;

    public HelloWorld() {
    }

    private static final int INITIAL_SIZE = 10;

        public static void main(String[] args) {
        ArrayList list1 = getList();


//        method1();

        System.out.println(list1);


    }

    public static ArrayList getList() {
        //region Description
        System.out.println("helloworld!!!!");
        System.out.println("helloworld!!!!");
        ArrayList list1 = new ArrayList();
        //endregion

        /*ArrayList list1= null;
        synchronized ()*/

        Date date = new Date();
        list1.add(0, 123);
        return list1;
    }

    public static void method1() {

        num = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

