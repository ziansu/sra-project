@org.junit.Test
public void testCommandRecur() throws java.lang.Exception {
    com.done.command.Command command = new com.done.command.CommandRecur(1, "weekly", 1);
    assertEquals(command.getCommandType(), CommandType.RECUR);
}