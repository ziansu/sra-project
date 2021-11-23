public void sendObject(java.lang.Object obj) {
    try {
        if (!(socket.isClosed())) {
            out.writeObject(obj);
            if ((out) != null) {
                out.reset();
            }
            out.flush();
        }
    } catch (java.net.SocketException e) {
        closeSocket();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}