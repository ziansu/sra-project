private synchronized void updateQueue(final long[] flashing) {
    mFlashingQueue.clear();
    mFlashingQueue.add(0L);
    for (long value : flashing) {
        mFlashingQueue.add(value);
    }
}