private void updateTrackerTracker(int trackerIndex) {
    final int ttIndex = trackerIndex >>> 6;
    final int ttBit = trackerIndex & 63;
    while (true) {
        long oldValue = trackerTracker.get(ttIndex);
        long newValue = oldValue | (1L << ttBit);
        if ((newValue == oldValue) || (trackerTracker.compareAndSet(ttIndex, oldValue, newValue))) {
            break;
        }
    } 
}