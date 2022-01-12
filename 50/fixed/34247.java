public double calculateBsquared(org.openpixi.pixi.physics.grid.Grid grid) {
    Bsquared.reset(grid);
    grid.getCellIterator().execute(grid, Bsquared);
    return Bsquared.getSum();
}