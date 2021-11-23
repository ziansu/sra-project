public static void main(java.lang.String[] args) {
    Maze m = new Maze(args[0]);
    m.solve(java.lang.Integer.parseInt(args[1]), true);
    java.lang.System.out.println(m);
}