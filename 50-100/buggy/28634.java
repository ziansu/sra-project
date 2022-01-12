@org.junit.Test
public void testgameover() {
    battleships.Ocean ocean = new battleships.Ocean();
    ocean.placeAllShipsRandomly();
    ocean.print();
    assertTrue((!(ocean.isGameOver())));
    for (int row = 0; row < 10; row++) {
        for (int col = 0; col < 10; col++) {
            ocean.shootAt(row, col);
            ocean.print();
        }
    }
}