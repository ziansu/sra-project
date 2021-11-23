public boolean moveUp() {
    for (int i = 0; i < (board.length); i++) {
        for (int j = 1; j < (board.length); j++) {
            moveTo(j, i, (j - 1), i);
        }
    }
    return false;
}