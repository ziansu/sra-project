@com.couchbase.lite.internal.InterfaceAudience.Public
public boolean isRunning() {
    if ((replicationInternal) == null)
        return false;
    
    return replicationInternal.isRunning();
}