public void mousePressed() {
    if ((player[currentPlayer]) instanceof HumanPlayer) {
        Move m = gameUI.getHighlightedMove();
        PerformMove(m);
    }
}