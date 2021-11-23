@java.lang.Override
public void run() {
    try {
        socket = new java.net.Socket(ip, port);
        java.io.InputStream in = socket.getInputStream();
        java.io.DataInputStream dis = new java.io.DataInputStream(in);
        while (!(isStopped())) {
            byte[] data = new com.github.sdnwiselab.sdnwise.packet.NetworkPacket(dis).toByteArray();
            setChanged();
            notifyObservers(data);
        } 
    } catch (java.io.IOException ex) {
        log(java.util.logging.Level.SEVERE, ("+++++" + (ex.toString())));
    }
}