public synchronized void update(int[] countBuffer, int numCounts) {
    for (int i = 0; i < numCounts; i++) {
        int cmid = countBuffer[i];
        int index = findOrCreateHeapIdx(cmid);
        (counts[index])++;
        heapifyUp(index);
        if (org.jikesrvm.VM.useAOSDB) {
            VM.methodDatabase.putCallCount(cmid, numCounts);
        }
    }
    totalCountsTaken += numCounts;
    if (org.jikesrvm.adaptive.database.methodsamples.MethodCountData.DEBUG)
        validityCheck();
    
}