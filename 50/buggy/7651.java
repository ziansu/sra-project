@java.lang.Override
public boolean isClosed() {
    return connection.getSession().isClosed();
}