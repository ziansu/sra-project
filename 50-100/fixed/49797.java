private void checkWin() {
    if (gameBoard.checkWin()) {
        curPlayer.setText(("Winner: " + (gameBoard.getWinner().getColorString())));
        java.lang.System.out.println(curPlayer.getText());
        while (gameBoard.checkWin());
        java.lang.System.exit(0);
    }
}