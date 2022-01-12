private void enableChessBoard() {
    mChessBoardView.setEnabled(true);
    mChessBoardView.setEventListener(new org.empyrn.darkknight.ChessBoardEventListener(mGameController));
}