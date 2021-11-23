private void handleSwitchConnected(final org.openscada.core.client.ConnectionState state, final java.lang.Throwable error, final java.util.Map<java.lang.String, java.lang.String> properties) {
    switch (state) {
        case CLOSING :
            requestClose(error);
            onConnectionClosed();
            break;
        case CLOSED :
            requestClose(error);
            onConnectionClosed();
            break;
        case BOUND :
            this.properties = properties;
            setState(ConnectionState.BOUND, error);
            onConnectionBound();
            break;
    }
}