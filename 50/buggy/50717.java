public boolean pingNode() {
    try {
        java.net.InetAddress byName = java.net.InetAddress.getByName(NodeIP);
        return byName.isReachable(1000);
    } catch (java.net.UnknownHostException e) {
        return false;
    } catch (java.io.IOException e) {
        return false;
    }
}