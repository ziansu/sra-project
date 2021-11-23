@org.junit.jupiter.api.Test
public void testEveryCellHasCorrectCoordinates() {
    for (int i = 0; i < (cells.length); i++) {
        for (int j = 0; j < (cells[i].length); j++) {
            assertCoordinatesAreEquals(i, j, cells[i][j].getRow(), cells[i][j].getCol());
        }
    }
}