public static void main(java.lang.String[] args) {
    Maze m = new Maze("data1.dat");
    java.lang.System.out.println((((("(" + (m.startx)) + ",") + (m.starty)) + ")"));
    java.lang.System.out.println(m.solveBFS(true));
    m.solutionCoordinates();
    java.lang.System.out.println(("Location of E: " + (Maze.target)));
    java.lang.System.out.println(("Solution: \n" + (m.sol)));
}