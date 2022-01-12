@javax.annotation.Nullable
protected Snapshot takeSnapshot(boolean persist) throws java.io.IOException {
    if ((data) == null)
        throw new java.lang.IllegalStateException();
    
    if (isTrivial(data))
        return null;
    
    Snapshot snapshot = captureData(data, persist);
    if (persist)
        objService.write(snapshot);
    
    return snapshot;
}