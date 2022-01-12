public void broadCastMessage(sendable.Message bm) throws java.io.IOException {
    for (java.net.Socket sock : sync.ClientCenter.getInstance().getSockets()) {
        if (sock != null) {
            if (!(sock.isClosed())) {
                java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(sock.getOutputStream());
                bm.setTimestamp();
                oos.writeObject(bm);
                oos.flush();
            }
        }
    }
}