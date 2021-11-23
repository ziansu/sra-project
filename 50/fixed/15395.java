public synchronized void removeFile(java.lang.Long f) {
    invalidateHashSetHitsCount();
    fileIDs.removeAll(f);
}