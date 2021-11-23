@org.junit.Test
public void testSortFileContentsIsEmpty() {
    TextBuddy.loadFile(new java.lang.String[]{ fileName });
    TextBuddy.clearFileContents();
    assertEquals(TextBuddy.sortFileContents(), ((fileName) + " is empty\n"));
}