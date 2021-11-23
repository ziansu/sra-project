public static void logClient(int id, java.net.InetAddress address, int port) {
    utilies.ClientConfig client = new utilies.ClientConfig(id, address, port);
    utilies.ClientMap.clients.add(client);
}