public void print() {
    for (int i = 0; i < (Constants.BOARD_LENGTH); i++) {
        for (int j = 0; j < (Constants.BOARD_WIDTH); j++) {
            java.lang.System.out.print((("[" + (board[i][j].getPosition())) + "]"));
        }
        java.lang.System.out.print("\n");
    }
}