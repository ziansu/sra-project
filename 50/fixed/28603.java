public boolean setBoard(int x, int y) {
    if (!(canMove())) {
        nextboard = new int[]{ x , y };
        return canMove();
    }
    return false;
}