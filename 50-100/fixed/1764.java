public final void onConnected(hprose.net.Connection conn) {
    hprose.client.Request request = requests.poll();
    if (request != null) {
        send(conn, request);
    }else {
        synchronized(idleConnections) {
            if (!(idleConnections.contains(conn))) {
                idleConnections.offer(conn);
            }
        }
        recycle(conn);
    }
}