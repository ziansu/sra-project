public void testClearFileContents() {
    TextBuddy.clearFileContents();
    assertEquals(TextBuddy.displayFileContents(), ((fileName) + " is empty\n"));
}