public boolean isWritable(org.apache.activemq.artemis.spi.core.remoting.ReadyListener callback) {
    synchronized(readyListeners) {
        readyListeners.push(callback);
        return ready;
    }
}