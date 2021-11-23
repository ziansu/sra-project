public void initMaze() {
    fileToArray();
    findStartingPos();
    findEndingPos();
    maxMoves *= (maze.length) * (maze[0].length);
    try {
        runner = new Rat(startPos, findStartingDirection());
    } catch (java.lang.NullPointerException e) {
        ErrorFrame.setVisible(true);
        EP.msg1();
    }
    numberOfMoves = 0;
}