public void drawLogic() {
    for (int i = 0; i <= ((gg_grid.getMaxCellsWidth()) - 1); i++) {
        for (int j = 0; j <= ((gg_grid.getMaxCellsHeight()) - 1); j++) {
            isAlive[i][j] = false;
            java.lang.System.out.println(isAlive[i][j]);
        }
    }
}