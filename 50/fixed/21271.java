public boolean gameOver() {
    for (Square square : squares) {
        if ((square != null) && (square.isDead())) {
            java.lang.System.out.println("Capture - Game Over");
            return true;
        }
    }
    return false;
}