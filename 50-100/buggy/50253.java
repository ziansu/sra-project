@org.junit.Test
public void testPut() throws java.lang.Exception {
    boolean areEqual = values.get(0).equals(table.put("key", values.get(1)));
    assertTrue(areEqual);
    assertNull(table.put("other key", values.get(0)));
}