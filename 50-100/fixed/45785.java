@java.lang.Override
public void close() throws java.io.IOException {
    try {
        engine.closeOutbound();
        while ((!(isClosed)) && (!(engine.isOutboundDone()))) {
            application.clear();
            wrap(true);
        } 
    } finally {
        isClosed = true;
        parent.close();
    }
}