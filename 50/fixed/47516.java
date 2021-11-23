public static void main(java.lang.String[] args) {
    Maze a = new Maze("data1.dat");
    java.lang.System.out.println(a);
    java.lang.System.out.println();
    java.lang.System.out.println(a.solveDFS());
    java.lang.System.out.println();
    java.lang.System.out.println(a);
}