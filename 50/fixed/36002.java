private void closeConnections() {
    for (final io.datakernel.rpc.server.RpcServerConnection connection : new java.util.ArrayList(connections.values())) {
        connection.close();
    }
}