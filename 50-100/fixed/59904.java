@java.lang.Override
public void handler(java.net.InetAddress addr, byte[] msg) {
    if ((msg[0]) == 255)
        stopServer();
    
    try {
        message = new TrivaGameServer.TrivaMessage(addr, msg);
        synchronized(this) {
            setChanged();
            notifyObservers();
        }
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
    }
}