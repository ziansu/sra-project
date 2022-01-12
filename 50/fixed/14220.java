public void testDisplayFileContents() {
    TextBuddy.addNewLine("little brown fox");
    assertEquals("1. little brown fox\n", TextBuddy.displayFileContents());
}