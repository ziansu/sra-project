@org.junit.BeforeClass
public static void setUpClass() {
    clientcommunicator.Server.ServerProxy.setSERVER_HOST("localhost");
    clientcommunicator.Server.ServerProxy.setSERVER_PORT("8081");
    clientcommunicator.Server.ServerProxyTest.server = new server.Server(8081);
    clientcommunicator.Server.ServerProxyTest.server.run(null, null);
}