public void received(com.esotericsoftware.kryonet.Connection conn, java.lang.Object object) {
    final T connection = classTag.cast(conn);
    final java.util.List<com.esotericsoftware.kryonet.adapters.Listener<? super T>> listeners = this.listeners;
    for (int i = 0, n = listeners.size(); i < n; i++)
        listeners.get(i).received(connection, object);
    
}