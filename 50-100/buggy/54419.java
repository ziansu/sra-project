public void run() {
    for (java.util.Iterator<org.amityregion5.qxrz.common.net.NetworkNode> it = clients.iterator(); it.hasNext();) {
        org.amityregion5.qxrz.common.net.NetworkNode n = it.next();
        try {
            removeClient(n);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}