public void initMaze() {
    try {
        fileToArray();
        findStartingPos();
        findEndingPos();
        runner = new Rat(startPos, findStartingDirection());
    } catch (java.lang.NullPointerException e) {
        ErrorFrame.setVisible(true);
        EP.msg1();
    }
    maxMoves *= (maze.length) * (maze[0].length);
    numberOfMoves = 0;
}