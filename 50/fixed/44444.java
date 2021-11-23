@org.junit.Test
public void testGetShouldTags() throws java.lang.Exception {
    assertTrue(demand.getShouldTags().get(0).equals(original.getShouldTags().get(0)));
}