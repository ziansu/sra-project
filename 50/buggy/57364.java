@org.junit.Test
public void testCommandRecur() throws java.lang.Exception {
    com.done.command.Command command = new com.done.command.CommandRecur(1, "weekly");
    assertEquals(command.getCommandType(), CommandType.RECUR);
}