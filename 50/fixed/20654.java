public void fireConnectionClosed() {
    javax.sql.ConnectionEvent event = new javax.sql.ConnectionEvent(this);
    for (javax.sql.ConnectionEventListener listener : connectionEventListeners) {
        listener.connectionClosed(event);
    }
}