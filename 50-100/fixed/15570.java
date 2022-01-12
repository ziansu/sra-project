public void drawLogic() {
    isAlive = new boolean[(gg_grid.getMaxCellsWidth()) + 1][(gg_grid.getMaxCellsHeight()) + 1];
    for (int i = 0; i <= (gg_grid.getMaxCellsWidth()); i++) {
        for (int j = 0; j <= (gg_grid.getMaxCellsHeight()); j++) {
            isAlive[i][j] = false;
            java.lang.System.out.println(isAlive[i][j]);
        }
    }
}