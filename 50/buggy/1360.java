public static void main(java.lang.String[] args) {
    Maze m = new Maze(args[0]);
    m.solve(3, true);
    java.lang.System.out.println(m);
}