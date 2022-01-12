public void close(ch.ninecode.cim.connector.CIMConnection connection) {
    if (null != connection)
        if (connection._Valid) {
            connection.invalidate();
            javax.resource.spi.ConnectionEvent event = new javax.resource.spi.ConnectionEvent(this, javax.resource.spi.ConnectionEvent.CONNECTION_CLOSED);
            event.setConnectionHandle(connection);
            for (javax.resource.spi.ConnectionEventListener listener : _Listeners)
                listener.connectionClosed(event);
            
        }
    
}