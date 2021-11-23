public void createCells() {
    cells = new Cell[num_high][num_wide];
    for (int row = 0; row < (num_high); row++) {
        for (int column = 0; column < (num_wide); column++) {
            cells[row][column] = new Cell();
        }
    }
}