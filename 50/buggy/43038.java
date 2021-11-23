@java.lang.Override
public void dispose() {
    if ((server) != null) {
        server.removePropertyChangeListener(listener);
    }
}