public synchronized void addFile(java.lang.Long f) {
    if ((fileIDs.contains(f)) == false) {
        fileIDs.add(f);
    }
    invalidateHashSetHitsCount();
}