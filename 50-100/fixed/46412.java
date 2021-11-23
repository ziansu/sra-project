@java.lang.Override
public void run() {
    while (true) {
        try {
            java.net.Socket socket = proxyServerSocket.accept();
            java.net.InetAddress address = socket.getInetAddress();
            java.lang.String name = nameForAddress.get(address);
            if (name == null) {
                name = nameFactory.getName();
                nameForAddress.put(address, name);
            }
            new MinecraftProxy.Worker(socket, name);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    } 
}