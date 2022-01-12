@java.lang.Override
public AsyncTcpSocket.EventHandler onConnect(io.datakernel.eventloop.AsyncTcpSocket conn) {
    removePendingSocketConnect(address);
    io.datakernel.http.ExposedLinkedList<io.datakernel.http.AbstractHttpConnection> pool = ipConnectionLists.get(address);
    if (pool == null) {
        pool = new io.datakernel.http.ExposedLinkedList();
        ipConnectionLists.put(address, pool);
    }
    io.datakernel.http.HttpClientConnection connection = new io.datakernel.http.HttpClientConnection(eventloop, address, conn, this, pool, headerChars, maxHttpMessageSize);
    activeConnections.add(connection);
    sendRequest(connection, request, timeoutTime, callback);
    return connection;
}