@org.junit.Test
public void testDeleteobtainStringHashMap() throws java.text.ParseException {
    Task.StringParser.getStringHashMap(COMMAND_TYPE.DELETE_TASK, "", keywordHash);
    assertEquals(1, keywordHash.size());
    Task.StringParser.getStringHashMap(COMMAND_TYPE.EDIT_TASK, "10", keywordHash);
    assertEquals("10", keywordHash.get(PARAMETER.TASKID));
    Task.StringParser.getStringHashMap(COMMAND_TYPE.EDIT_TASK, " 10", keywordHash);
    assertEquals("10", keywordHash.get(PARAMETER.TASKID));
    Task.StringParser.getStringHashMap(COMMAND_TYPE.EDIT_TASK, "10 ", keywordHash);
    assertEquals("10", keywordHash.get(PARAMETER.TASKID));
}