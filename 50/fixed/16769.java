@org.junit.Test
public void testSortFileContentsNotEmpty() {
    TextBuddy.loadFile(new java.lang.String[]{ fileName });
    TextBuddy.clearFileContents();
    TextBuddy.addNewLine("little brown fox");
    assertEquals(((fileName) + " has been alphabetically sorted\n"), TextBuddy.sortFileContents());
}