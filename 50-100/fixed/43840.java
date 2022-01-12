@org.junit.Test
public void testSetBelowCapacity() {
    c.put(1, 1);
    assertEquals(c.get(1), 1);
    assertEquals(c.get(2), null);
    c.put(2, 4);
    assertEquals(c.get(1), 1);
    assertEquals(c.get(2), 4);
}