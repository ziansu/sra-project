public int getWin() {
    if ((freeSpaces) != 0) {
        return EMPTY;
    }
    if ((blackScore) > (whiteScore)) {
        return BLACK;
    }
    if ((whiteScore) > (blackScore)) {
        return WHITE;
    }else {
        return DEAD;
    }
}