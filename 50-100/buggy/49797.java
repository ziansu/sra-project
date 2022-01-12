private void checkWin() {
    if (gameBoard.checkWin()) {
        curPlayer.setText(("Winner: " + (gameBoard.getWinner().getColorString())));
        java.lang.System.out.println(curPlayer.getText());
        java.lang.System.exit(0);
    }
}