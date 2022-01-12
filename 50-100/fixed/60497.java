public me.doubledutch.stroom.streams.Document getDocument(long location) throws java.io.IOException {
    if (location < 0)
        return null;
    
    if (location > (currentLocation))
        return null;
    
    waitForCommit(location);
    me.doubledutch.stroom.streams.Index index = getIndexForLocation(location);
    me.doubledutch.stroom.streams.IndexEntry entry = index.seekEntry(location);
    if (entry != null) {
        return getDocument(entry.getBlock(), entry.getOffset(), entry.getSize(), location);
    }
    return null;
}