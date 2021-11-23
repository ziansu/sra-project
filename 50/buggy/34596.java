@org.junit.Test
public void testIncreaseLevel() {
    nl.group37.bejeweled.main.model.Tile t1 = new nl.group37.bejeweled.main.model.Tile(1, 1);
    org.junit.Assert.assertEquals(t1.getLevel(), 0);
    t1.increaseLevel();
    org.junit.Assert.assertEquals(t1.getLevel(), 1);
}