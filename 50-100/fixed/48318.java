public void close() throws java.lang.Exception {
    if (!(connected)) {
        return ;
    }
    connected = false;
    com.shtrih.fiscalprinter.port.SharedObjects.getInstance().release(portName);
    in = null;
    out = null;
    socket.close();
    socket = null;
    java.lang.Thread.sleep(100);
}