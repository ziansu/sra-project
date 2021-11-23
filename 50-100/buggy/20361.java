public void clear() {
    for (int i = 0; i < (gameGrid.length); i++) {
        for (int j = 0; j < (gameGrid[0].length); j++) {
            gameGrid[i][j] = 0;
        }
        java.lang.System.out.println();
    }
}