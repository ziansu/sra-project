public void clear() {
    for (int row = 0; row < (com.electdead.newgame.engine.Grid.ROWS); row++) {
        for (int col = 0; col < (com.electdead.newgame.engine.Grid.COLS); col++) {
            cells[row][col].clear();
        }
    }
}