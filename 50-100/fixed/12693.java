@org.junit.Test
public void testMoveCutOff() {
    java.lang.String boardStr = "x  x  x  0  1\n" + ((("x  x  x  0 1h\n" + "x  x  x  0h x\n") + "x  x  x  x  x\n") + "x  x  x  x  x");
    Board b = Board.fromString(boardStr);
    Driver d = new VoronoiMinMax();
    Direction move = d.move(b);
    assertEquals(Direction.RIGHT, move);
    b.move(b.US, b.tileFrom(b.ourTile(), move));
}