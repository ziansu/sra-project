public static void main(java.lang.String[] args) {
    Maze a = new Maze("data1.dat");
    java.lang.System.out.println(a);
    a.solveBFS(true);
}