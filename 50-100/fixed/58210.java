@org.junit.Test
public void testSet() {
    list.set(0, "1");
    assertEquals("1", list.get(0));
    assertEquals("1", list.set(0, "2"));
    assertEquals("2", list.get(0));
    assertEquals(1, list.size());
}