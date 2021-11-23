@org.junit.Test
public void testPut() throws java.lang.Exception {
    assertEquals(values.get(0), table.put("key", values.get(1)));
    assertNull(table.put("other key", values.get(0)));
}