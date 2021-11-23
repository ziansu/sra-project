@org.junit.Test
public void numDoors() {
    int door = 0;
    for (clueGame.BoardCell[] i : tests.clueBoardTests.board.getBoard()) {
        for (clueGame.BoardCell j : i) {
            if ((j != null) && (j.isDoorway())) {
                ++door;
            }
        }
    }
    assertEquals(tests.clueBoardTests.NUM_DOORS, door);
}