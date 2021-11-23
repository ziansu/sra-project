public void deregister() throws java.io.IOException {
    if ((listen) == null) {
        java.lang.System.out.println("Register first!");
        return ;
    }
    java.net.Socket sock = createSocket();
    if (!(sendAndReceive(("deregister " + (id)))));
    {
        java.lang.System.out.println("Deregister failed, try again");
    }
    listen.interrupt();
    listen = null;
    sock.close();
}