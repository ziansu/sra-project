@org.junit.Test
public void testAddInvalidDeadlineDate() {
    initTestEnvironment();
    addTask();
    java.lang.String currCommand = "add invalid deadline date by nowhere";
    entity.Success status = commandParser.parseCommand(currCommand);
    assertFalse(status.isSuccess());
}