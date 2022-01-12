public synchronized void update(int cmid, double numCounts) {
    int index = findOrCreateHeapIdx(cmid);
    counts[index] += numCounts;
    heapifyUp(index);
    totalCountsTaken += numCounts;
    if (org.jikesrvm.adaptive.database.methodsamples.MethodCountData.DEBUG)
        validityCheck();
    
    if (org.jikesrvm.VM.useAOSDB) {
        VM.methodDatabase.putCallCount(cmid, numCounts);
    }
}