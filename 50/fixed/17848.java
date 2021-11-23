public synchronized void addFile(java.lang.Long f) {
    invalidateHashSetHitsCount();
    if ((fileIDs.contains(f)) == false) {
        fileIDs.add(f);
    }
}