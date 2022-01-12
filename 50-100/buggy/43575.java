public void displayWeightedBoard() {
    java.lang.System.out.println("Weighted Board");
    for (int j = 0; j < (boardY); j++) {
        for (int i = 0; i < (boardX); i++) {
            java.lang.System.out.print((" " + (optimalMatrix[i][j])));
        }
        java.lang.System.out.println();
    }
}