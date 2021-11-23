@java.lang.Override
public void unlock(org.mwg.struct.Buffer previousLock, org.mwg.Callback<java.lang.Boolean> callback) {
    if (!(isConnected)) {
        throw new java.lang.RuntimeException(org.mwg.HBaseThriftStorage._connectedError);
    }
    callback.on(true);
}