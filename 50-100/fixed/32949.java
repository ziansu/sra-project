private static java.util.List<ar.fiuba.tdd.grupo10.nikoligames.grid.cells.Cell> populateGrid() {
    java.util.List<ar.fiuba.tdd.grupo10.nikoligames.grid.cells.Cell> grid = new java.util.ArrayList<>();
    for (int i = 0; i < (ar.fiuba.tdd.grupo10.nikoligames.KakuroFactory.TOTAL_CELLS); i++) {
        grid.add(ar.fiuba.tdd.grupo10.nikoligames.KakuroFactory.createMutableCell());
    }
    return grid;
}