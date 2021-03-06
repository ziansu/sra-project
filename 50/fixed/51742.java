public void removeClient(org.amityregion5.qxrz.common.net.NetworkNode c) {
    synchronized(clients) {
        clients.remove(c);
    }
    try {
        c.send(new org.amityregion5.qxrz.common.net.Goodbye());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}