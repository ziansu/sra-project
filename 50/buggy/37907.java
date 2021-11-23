@org.junit.Test
public void testGet_int() {
    list.add(null, "1", "2", "3");
    assertEquals("2", object.get(1));
}