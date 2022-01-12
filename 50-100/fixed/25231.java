public void testAddNewLine() {
    TextBuddy.clearFileContents();
    assertEquals((("added to " + (fileName)) + ": \"little brown fox\"\n"), TextBuddy.addNewLine("little brown fox"));
    assertEquals((("added to " + (fileName)) + ": \"jumped over the moon\"\n"), TextBuddy.addNewLine("jumped over the moon"));
}