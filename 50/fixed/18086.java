public double calculateEsquared(org.openpixi.pixi.physics.grid.Grid grid, int dir) {
    Esquared.reset(grid);
    grid.getCellIterator().execute(grid, Esquared);
    return Esquared.getSum(dir);
}