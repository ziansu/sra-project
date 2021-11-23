@java.lang.Override
public void dispose() {
    if ((this.server) != null) {
        this.server.removePropertyChangeListener(this.listener);
    }
}