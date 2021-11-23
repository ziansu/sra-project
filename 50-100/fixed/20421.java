public boolean addConnection(java.lang.String id, org.red5.server.api.IConnection conn) {
    if ((connections) == null) {
        java.lang.System.out.println("Connections is null!!!!");
        return false;
    }
    if (id == null) {
        java.lang.System.out.println("CONN ID IS NULL!!!");
    }
    if (conn == null) {
        java.lang.System.out.println("CONN IS NULL");
    }
    return (connections.putIfAbsent(id, conn)) == null;
}