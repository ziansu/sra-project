@org.junit.Test
public void testDisplayobtainStringHashMap() throws java.text.ParseException {
    Task.StringParser.getStringHashMap(COMMAND_TYPE.EDIT_TASK, "", keywordHash);
    assertEquals(0, keywordHash.size());
    Task.StringParser.getStringHashMap(COMMAND_TYPE.DISPLAY, " 4", keywordHash);
    assertEquals("4", keywordHash.get(PARAMETER.TASKID));
}