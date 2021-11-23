public void close(ch.ninecode.cim.connector.CIMConnection connection) {
    if (null != connection)
        if (connection._Valid) {
            connection.invalidate();
            java.util.Enumeration<javax.resource.spi.ConnectionEventListener> list = _Listeners.elements();
            javax.resource.spi.ConnectionEvent event = new javax.resource.spi.ConnectionEvent(this, javax.resource.spi.ConnectionEvent.CONNECTION_CLOSED);
            event.setConnectionHandle(connection);
            while (list.hasMoreElements())
                list.nextElement().connectionClosed(event);
            
        }
    
}