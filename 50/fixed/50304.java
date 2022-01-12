public void isOpen() {
    minesweeper.MinesweeperCell cell = new minesweeper.MinesweeperCell();
    cell.open();
    assertTrue(cell.isOpen());
}