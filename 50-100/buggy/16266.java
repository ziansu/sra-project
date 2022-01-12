public void displayBoard() {
    for (int i = 0; i < (columnLength); i++) {
        for (int j = 0; j < (rowLength); j++) {
            printBoardSlot(i, j);
        }
        java.lang.System.out.println("|");
    }
}