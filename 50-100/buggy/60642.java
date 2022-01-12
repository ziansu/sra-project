@org.junit.Test
public void testSortFileContentsNotEmpty() {
    TextBuddy.loadFile(new java.lang.String[]{ fileName });
    TextBuddy.clearFileContents();
    TextBuddy.addNewLine("little brown fox");
    assertEquals(TextBuddy.sortFileContents(), ((fileName) + " has been alphabetically sorted\n"));
}