public void idle(com.esotericsoftware.kryonet.Connection conn) {
    final T connection = classTag.cast(conn);
    final java.util.List<com.esotericsoftware.kryonet.adapters.Listener<? super T>> listeners = this.listeners;
    for (com.esotericsoftware.kryonet.adapters.Listener<? super T> listener : listeners) {
        listener.idle(connection);
        if (!(connection.isIdle()))
            break;
        
    }
}