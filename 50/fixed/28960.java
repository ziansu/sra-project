@org.junit.Test
public void testGetMappedValue_NoSuchType() {
    tracker.put("", new java.util.HashSet());
    assertNull(tracker.getMappedValue("", java.lang.String.class));
}