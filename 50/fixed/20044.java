@org.junit.Test
public void testEntities() {
    assertNotNull(die);
    assertTrue(((die) instanceof Game.Die));
}