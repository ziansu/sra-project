public final void onSended(hprose.net.Connection conn, java.lang.Integer id) {
    synchronized(idleConnections) {
        if (!(idleConnections.contains(conn))) {
            idleConnections.offer(conn);
        }
    }
}