@org.junit.Before
public void setUp() throws java.lang.Exception {
    org.server.rmi.RMIHelper.getinstance().buildStubConnection();
    org.client.rmi.RMIHelper.getInstance().init();
    mySQL.DatabaseCommunicator.setTestConnection();
    controller = org.client.bl.userbl.UserController.getInstance();
}