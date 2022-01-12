@org.junit.Test
public void isLoggedInCriticalErrorTest() {
    int senderID = 1;
    java.lang.String command = new ClientServerApi.CommandWrapper(senderID, ClientServerApi.CommandDescriptor.IS_LOGGED_IN).serialize();
    CommandHandler.CommandExecuter commandExecuter = new CommandHandler.CommandExecuter(command);
    ClientServerApi.CommandWrapper out;
    try {
        org.mockito.Mockito.when(sqlDatabaseConnection.isClientLoggedIn(senderID)).thenThrow(new SQLDatabase.SQLDatabaseException.CriticalError());
    } catch (SQLDatabase.SQLDatabaseException.CriticalError e) {
        org.junit.Assert.fail();
    }
    out = commandExecuter.execute(sqlDatabaseConnection);
    org.junit.Assert.assertEquals(ResultDescriptor.SM_ERR, out.getResultDescriptor());
}