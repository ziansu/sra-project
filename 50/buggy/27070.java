@org.junit.Test
public void testRemove() {
    list.set(0, "1");
    assertEquals("1", list.remove(0));
    assertEquals(null, list.get(0));
}