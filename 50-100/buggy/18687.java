public void sendObject(java.lang.Object obj) {
    try {
        if (!(socket.isClosed())) {
            out.writeObject(obj);
            out.reset();
            out.flush();
        }
    } catch (java.net.SocketException e) {
        closeSocket();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}