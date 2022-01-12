public void disconnected(com.esotericsoftware.kryonet.Connection conn) {
    final T connection = classTag.cast(conn);
    removeConnection(connection);
    final java.util.List<com.esotericsoftware.kryonet.adapters.Listener<? super T>> listeners = this.listeners;
    for (int i = 0, n = listeners.size(); i < n; i++)
        listeners.get(i).disconnected(connection);
    
}