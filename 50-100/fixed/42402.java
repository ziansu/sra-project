private void sendOut(byte[] data) {
    if (socket.isClosed()) {
        return ;
    }
    try {
        socket.getOutputStream().write(data);
    } catch (java.io.IOException ex) {
        try {
            closeSocket();
        } catch (java.io.IOException ex1) {
            java.util.logging.Logger.getLogger(me.joba.workingudpclient.tcp.TCPChannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex1);
        }
    }
}