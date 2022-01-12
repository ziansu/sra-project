private int getMove(maze.Cell start, maze.Cell end) {
    for (int i = 0; i < (maze.Maze.NUM_DIR); i++) {
        if ((((start.r) + (maze.Maze.deltaR[i])) == (end.r)) && (((start.c) + (maze.Maze.deltaC[i])) == (end.c))) {
            java.lang.System.out.println(("Direction is: " + i));
            return i;
        }
    }
    return 0;
}