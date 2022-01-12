@org.junit.Test
public void shouldReturnAGetUserCommand() throws fhj.shelf.commandParser.CommandParserException {
    fhj.shelf.utils.User user = new fhj.shelf.utils.User("Paulo", "000", "vjvjfv", "JGGO");
    userrepository.insert(user);
    parser.registerCommand("GET", "/User", new fhj.shelf.commands.GetUser.Factory(userrepository));
    assertTrue(((parser.getCommand("GET", "/User", "username=Paulo")) instanceof fhj.shelf.commands.GetUser));
}