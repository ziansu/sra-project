@org.junit.Test
public void testIntersects_withCoords_withIntersectingCoords() {
    final com.valkryst.VTerminal.component.Component component = new com.valkryst.VTerminal.component.Component(0, 0, width, height);
    for (int x = 0; x < ((width) - 1); x++) {
        for (int y = 0; y < ((height) - 1); y++) {
            org.junit.Assert.assertTrue(component.intersects(x, y));
        }
    }
}