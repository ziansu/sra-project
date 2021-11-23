@org.junit.Test
public void testResetD() {
    nl.group37.bejeweled.main.model.Tile t1 = new nl.group37.bejeweled.main.model.Tile(1, 1);
    t1.updateTranslation(2, 2);
    java.awt.Point p1 = new java.awt.Point(2, 2);
    assertEquals(t1.getTranslation(), p1);
    java.awt.Point q1 = new java.awt.Point(0, 0);
    t1.resetD();
    assertEquals(t1.getTranslation(), q1);
}