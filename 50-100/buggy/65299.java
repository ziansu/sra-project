private static synchronized java.net.Socket createSocket() throws java.io.IOException, java.net.UnknownHostException {
    teamEleven.configController.ConfigController cc = new teamEleven.configController.ConfigController("clientconfig.json");
    java.lang.String ip = cc.getString("ip", "127.0.0.1");
    int port = cc.getInt("port", 2345);
    client.transport.ClientSocket.socket = new java.net.Socket(ip, port);
    java.lang.System.out.println("create socket\n");
    return client.transport.ClientSocket.socket;
}