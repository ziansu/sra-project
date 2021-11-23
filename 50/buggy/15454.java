public final void onSended(hprose.net.Connection conn, java.lang.Integer id) {
    synchronized(idleConnections) {
        idleConnections.offer(conn);
    }
}