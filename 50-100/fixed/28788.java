public int gameIsOver() {
    boolean isOver = false;
    int nullIndex = -1;
    for (int i = 0; i < (tiles.length); i++) {
        if (isOver && ((tiles[i]) == null)) {
            nullIndex = -1;
        }
        if ((!isOver) && ((tiles[i]) == null)) {
            isOver = true;
            nullIndex = i;
        }
    }
    return nullIndex;
}