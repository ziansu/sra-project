protected synchronized void moveRight() {
    for (pieces.Square square : squares) {
        (square.x)++;
    }
}