public void close() {
    try {
        channel.close();
    } catch (java.io.IOException ex) {
    }
    if ((server) == null) {
        try {
            selector.close();
        } catch (java.io.IOException ex) {
        }
    }else {
        server.clients.remove(this);
    }
}