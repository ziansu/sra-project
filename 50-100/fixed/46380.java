public void startReadOutputStream() {
    com.reign.client.core.StreamWatcher outputWatcher = new com.reign.client.core.StreamWatcher(process.getInputStream(), "OUTPUT", this);
    com.reign.client.core.StreamWatcher errorWatcher = new com.reign.client.core.StreamWatcher(process.getErrorStream(), "ERROR", this);
    new java.lang.Thread(outputWatcher, "process output watcher").start();
    new java.lang.Thread(errorWatcher, "process error watcher").start();
}