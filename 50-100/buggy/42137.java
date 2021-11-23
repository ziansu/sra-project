protected void shutdown() {
    org.apache.log4j.Logger.getLogger(getClass()).info("shutdown");
    running = false;
    if ((msgWriter) != null)
        msgWriter.end();
    
    if ((selector) != null)
        selector.wakeup();
    
    try {
        serverChannel.close();
    } catch (java.lang.Exception e) {
    }
}