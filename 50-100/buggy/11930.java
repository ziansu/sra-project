public void disconnect() throws java.io.IOException {
    if ((listen) == null) {
        java.lang.System.out.println("Register first!");
        return ;
    }
    java.net.Socket sock = createSocket();
    if (!(sendAndReceive(("disconnect " + (id)))));
    {
        java.lang.System.out.println("Disconnect failed, try again");
    }
    listen.interrupt();
    sock.close();
}