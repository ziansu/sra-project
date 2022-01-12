public void displayWeightedBoard() {
    java.lang.System.out.println("Weighted Board");
    for (int j = 0; j < (boardX); j++) {
        for (int i = 0; i < (boardY); i++) {
            java.lang.System.out.print((" " + (optimalMatrix[j][i])));
        }
        java.lang.System.out.println();
    }
}