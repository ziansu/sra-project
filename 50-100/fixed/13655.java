public void connectionOpened(org.eclipse.jetty.io.Connection connection) {
    try {
        connection.onOpen();
    } catch (java.lang.Throwable x) {
        if (isRunning())
            org.eclipse.jetty.io.SelectorManager.LOG.warn(("Exception while notifying connection " + connection), x);
        else
            org.eclipse.jetty.io.SelectorManager.LOG.debug(("Exception while notifying connection " + connection), x);
        
        throw x;
    }
}