public int getEmpty() {
    int counter = 0;
    for (int i = 0; i < (this.gameBoard.length); i++) {
        for (int j = 0; j < (this.gameBoard.length); j++) {
            if ((this.gameBoard[i][i]) == 1) {
                counter++;
            }
        }
    }
    return counter;
}