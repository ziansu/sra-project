@org.junit.Test
public void testPut_Interface() {
    tracker.put("", "1");
    tracker.put("", new java.util.HashSet());
    assertEquals(new java.util.HashSet(), tracker.getMappedValue("", java.util.Set.class));
}