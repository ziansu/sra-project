public void setupBoard() {
    java.util.Random rand = new java.util.Random();
    for (int i = 0; i < (numberOfCells); i++) {
        int xPosition = rand.nextInt(gridSize);
        int yPosition = rand.nextInt(gridSize);
        com.roo.Cell cell = new com.roo.Cell(board, xPosition, yPosition, gridSize);
        board[xPosition][yPosition] = cell;
    }
}