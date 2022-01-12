public void received(com.esotericsoftware.kryonet.Connection conn, java.lang.Object object) {
    final T connection = classTag.cast(conn);
    final java.util.List<com.esotericsoftware.kryonet.adapters.Listener<? super T>> listeners = this.listeners;
    for (com.esotericsoftware.kryonet.adapters.Listener<? super T> listener : listeners)
        listener.received(connection, object);
    
}