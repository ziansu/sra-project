@org.junit.Test
public void testGetState() {
    nl.group37.bejeweled.main.model.Tile t1 = new nl.group37.bejeweled.main.model.Tile(1, 1);
    org.junit.Assert.assertEquals(t1.getState(), Tile.State.NORMAL);
}