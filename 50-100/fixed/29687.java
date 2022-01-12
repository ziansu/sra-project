public void print() {
    for (int i = (Constants.BOARD_LENGTH) - 1; i >= 0; i--) {
        for (int j = 0; j < (Constants.BOARD_WIDTH); j++) {
            java.lang.System.out.print((("[" + (board[i][j].getPosition())) + "]"));
        }
        java.lang.System.out.print("\n");
    }
}