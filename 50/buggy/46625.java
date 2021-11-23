@org.junit.Test
public void testReturnEditCommand() {
    java.lang.String userCommand = "edit 3 morestuff";
    tasknote.shared.COMMAND_TYPE expectedResult = tasknote.shared.COMMAND_TYPE.UPDATE;
    assertEquals(tasknote.parser.Parser.getCommandType(userCommand), expectedResult);
}