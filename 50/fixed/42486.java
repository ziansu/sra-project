@org.junit.Test
public void testGetParentKey_Name_differentdb() {
    context.setDatabase("myTestWiki");
    replayDefault();
    assertEquals("mydatabase:Space.Name", notMappedItemsCmd.getParentKey("mydatabase", "Name", "Space"));
    verifyDefault();
}