private boolean isInBound(int currentX, int currentY) {
    try {
        char c = this.board[currentY][currentX];
    } catch (java.lang.IndexOutOfBoundsException e) {
        return false;
    }
    return true;
}