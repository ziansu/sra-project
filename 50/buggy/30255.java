@org.junit.Test
public void testGetSetUniqueId() {
    fact.setUniqueIds(java.util.Arrays.asList("TEST"));
    java.util.List<java.lang.String> ids = fact.getUniqueIds();
    org.junit.Assert.assertTrue(ids.contains("TEST"));
}