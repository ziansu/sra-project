@org.junit.Test
public void testCheckNeighbors() {
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            mockTileGrid[i][j] = new model.ObservableTile(i, j, 6);
        }
    }
    sfc.createMockboard(mockTileGrid);
}