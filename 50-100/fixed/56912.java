@org.junit.Test
public void testDrawMap() {
    level.drawMap();
    org.junit.Assert.assertEquals(8, level.getMonsters().size());
    org.junit.Assert.assertEquals(380, level.getWalls().size());
    org.junit.Assert.assertEquals(1, level.getPlayers().size());
}