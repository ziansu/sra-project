@org.junit.Test
public void blockwater() {
    java.awt.Point locc = new java.awt.Point(0, 0);
    cisc275.game.model.Water w = new cisc275.game.model.Water(locc, null, 0, 0, null);
    cisc275.game.model.Plant p = new cisc275.game.model.Plant(locc);
    p.blockwater();
    assertEquals(1, w.getHealth());
}