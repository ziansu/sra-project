public synchronized boolean send(java.lang.String msg) {
    if ((this.session) != null) {
        try {
            this.session.getRemote().sendString(msg);
            return true;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    return false;
}