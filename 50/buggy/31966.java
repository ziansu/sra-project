public void destroyServant() {
    try {
        server.remove(this);
        in.close();
        out.close();
        socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}