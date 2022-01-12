public static void main(java.lang.String[] args) {
    Maze m = new Maze(args[0]);
    m.solveBFS(true);
    java.lang.System.out.println(m);
}