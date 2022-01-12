public static void main(java.lang.String[] args) {
    Maze m = new Maze("data3.dat");
    java.lang.System.out.println(m);
    java.lang.System.out.println();
    java.lang.System.out.println(m.solveDFS());
    java.lang.System.out.println(m);
}