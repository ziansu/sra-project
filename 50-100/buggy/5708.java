public void playMoveAI(int[] coord, int player) {
    unselect();
    if (player == 0) {
        cellGrid[coord[0]][coord[1]].playMove(true);
    }else {
        cellGrid[coord[0]][coord[1]].playMove(false);
    }
}