public void updateLocation(java.lang.String whiteMove, java.lang.String blackMove) {
    player1.nextMove(whiteMove);
    if (whiteMove.contains("x")) {
        player2.setCapture(whiteMove);
    }
    player2.nextMove(blackMove);
    if (blackMove.contains("x")) {
        player1.setCapture(blackMove);
    }
}