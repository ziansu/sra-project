public void clear() {
    java.lang.System.out.println("Clear grid: delete cells");
    for (int row = 0; row < (com.electdead.newgame.engine.Grid.ROWS); row++) {
        for (int col = 0; col < (com.electdead.newgame.engine.Grid.COLS); col++) {
            cells[row][col].clear();
        }
    }
}