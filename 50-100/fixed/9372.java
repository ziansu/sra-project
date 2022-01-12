@org.junit.Test
public void testHasAllItems() {
    com.laboon.Player testPlayer = new com.laboon.Player(false, false, false);
    boolean result = testPlayer.hasAllItems();
    assertFalse(result);
    testPlayer.getSugar();
    result = testPlayer.hasAllItems();
    assertFalse(result);
    testPlayer.getCream();
    result = testPlayer.hasAllItems();
    assertFalse(result);
    testPlayer.getCoffee();
    result = testPlayer.hasAllItems();
    assertTrue(result);
}