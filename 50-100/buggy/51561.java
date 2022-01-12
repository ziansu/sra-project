public void testModelRemainsConsistentOnTextRemoval() {
    addCollapsedFoldRegion(0, 10, "...");
    addCollapsedFoldRegion(1, 9, "...");
    myEditor.getDocument().deleteString(0, 1);
    addFoldRegion(20, 21, "...");
    org.junit.Assert.assertTrue(myModel.isOffsetCollapsed(5));
}