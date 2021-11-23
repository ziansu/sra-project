private void cleanOtherDebuggers() {
    synchronized(myOtherDebuggersObject) {
        removeDisconnected(getOtherDebuggers());
    }
}