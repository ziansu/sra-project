@java.lang.Override
public void updateSubscriptions() {
    synchronized(getSyncObject()) {
        updateSubscriptions(nativePtr);
    }
}