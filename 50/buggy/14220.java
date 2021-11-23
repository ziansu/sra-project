public void testDisplayFileContents() {
    TextBuddy.addNewLine("little brown fox");
    assertEquals(TextBuddy.displayFileContents(), "1. little brown fox\n");
}