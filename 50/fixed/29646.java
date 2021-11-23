protected synchronized void moveLeft() {
    for (pieces.Square square : squares) {
        (square.x)--;
    }
}