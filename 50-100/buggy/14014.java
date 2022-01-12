@org.junit.Test
public void testSetTiles() {
    nl.group37.bejeweled.main.model.Combination x1 = combinationMaker();
    java.util.ArrayList<nl.group37.bejeweled.main.model.Tile> tiles = new java.util.ArrayList<nl.group37.bejeweled.main.model.Tile>();
    nl.group37.bejeweled.main.model.Tile a1 = new nl.group37.bejeweled.main.model.Tile(1, 1);
    tiles.add(a1);
    x1.setTiles(tiles);
    org.junit.Assert.assertEquals(tiles, x1.getTiles());
}