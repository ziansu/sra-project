public static void main(java.lang.String[] args) {
    com.shag.serverSim.server.tcp.ServerTCP serverTCP = new com.shag.serverSim.server.tcp.ServerTCPImpl();
    java.net.ServerSocket serverSocket = serverTCP.setServerSocket(com.shag.serverSim.server.tcp.Main.DEFAULT_PORT);
    java.net.Socket clientSocket = serverTCP.setSocket(serverSocket);
    java.io.InputStream inputStream = serverTCP.setInputStream(clientSocket);
    serverTCP.listen(inputStream);
    java.lang.System.out.println("Something");
}