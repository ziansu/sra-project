public void run() {
    java.lang.System.out.println(("Just connected to client" + (socket.getRemoteSocketAddress())));
    new protocol.Protocol().reply(socket);
    try {
        socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}