@org.junit.Test
public void testSortFileContentsMultipleLinesOutput() {
    TextBuddy.loadFile(new java.lang.String[]{ fileName });
    TextBuddy.clearFileContents();
    TextBuddy.addNewLine("there is no spoon");
    TextBuddy.addNewLine("little brown fox");
    TextBuddy.addNewLine("jumped over the moon");
    TextBuddy.sortFileContents();
    assertEquals(("1. jumped over the moon\n" + ("2. little brown fox\n" + "3. there is no spoon\n")), TextBuddy.displayFileContents());
}