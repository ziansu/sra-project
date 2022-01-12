@org.junit.Test
public void testSetBelowCapacity() {
    c.set(1, 1);
    assertEquals(c.get(1), 1);
    assertEquals(c.get(2), null);
    c.set(2, 4);
    assertEquals(c.get(1), 1);
    assertEquals(c.get(2), 4);
}