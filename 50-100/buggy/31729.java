private void updateTracker(int counter) {
    nonZeroCounters.incrementAndGet();
    final int trackerIndex = counter >>> 12;
    final int trackerBit = (counter >>> 6) & 63;
    while (true) {
        long oldValue = tracker.get(trackerIndex);
        long newValue = oldValue & (1 << trackerBit);
        if (newValue == oldValue) {
            break;
        }
        if (tracker.compareAndSet(counter, oldValue, newValue)) {
            updateTrackerTracker(trackerIndex);
            break;
        }
    } 
}