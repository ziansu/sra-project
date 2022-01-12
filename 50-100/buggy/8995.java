@org.junit.Test
public void testFillRegion() throws com.blackcrowsys.canvas.exception.CanvasOperationException {
    fillRegion();
    consoleCanvas.drawRectangle(new com.blackcrowsys.canvas.Coordinate(2, 1), new com.blackcrowsys.canvas.Coordinate(4, 2));
    consoleCanvas.fillRegion(new com.blackcrowsys.canvas.Coordinate(1, 1), 'o');
    assertArrayEquals(canvas, consoleCanvas.getCanvas());
}