public static void printClueBoard() {
    java.lang.System.out.println();
    for (int i = 0; i < (boardYDimension); i++) {
        for (int j = 0; j < (boardXDimension); j++) {
            java.lang.System.out.print(clueBoard[i][j]);
        }
        java.lang.System.out.println();
    }
    java.lang.System.out.println();
}