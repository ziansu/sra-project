private void newPiece() {
    curPiece.setRandomShape();
    curX = ((BoardWidth) / 2) + 1;
    curY = ((BoardHeight) - 1) + (curPiece.minY());
    if ((!(tryMove(curPiece, curX, curY))) || ((numLinesRemoved) == 50)) {
        curPiece.setShape(Tetrominoes.NoShape);
        timer.stop();
        isStarted = false;
        statusbar.setText(gameOverMsg);
    }
}