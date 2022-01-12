@java.lang.Override
public synchronized void start() {
    if ((view) == null)
        throw new java.lang.NullPointerException("Uninitialized view. You must call setView() first.");
    
    if ((server) != null)
        throw new java.lang.RuntimeException("Server already started");
    
    startServer();
}