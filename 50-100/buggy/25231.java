public void testAddNewLine() {
    TextBuddy.clearFileContents();
    assertEquals(TextBuddy.addNewLine("little brown fox"), (("added to " + (fileName)) + ": \"little brown fox\"\n"));
    assertEquals(TextBuddy.addNewLine("jumped over the moon"), (("added to " + (fileName)) + ": \"jumped over the moon\"\n"));
}