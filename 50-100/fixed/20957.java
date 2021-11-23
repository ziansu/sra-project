@org.junit.Test
public void testSetLoc() {
    nl.group37.bejeweled.main.model.Tile t1 = new nl.group37.bejeweled.main.model.Tile(1, 1);
    java.awt.Point q1 = new java.awt.Point(1, 1);
    assertEquals(t1.getLoc(), q1);
    java.awt.Point p1 = new java.awt.Point(2, 2);
    t1.setLoc(p1);
    assertEquals(t1.getLoc(), p1);
}