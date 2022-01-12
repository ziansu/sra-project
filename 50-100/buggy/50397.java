@org.junit.Test
public void testCapacityReachedOldestRemoved() {
    c.set(1, 1);
    c.set(2, 4);
    c.set(3, 9);
    assertEquals(c.get(1), null);
    assertEquals(c.get(2), 4);
    assertEquals(c.get(3), 9);
}