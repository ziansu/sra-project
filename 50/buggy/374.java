private synchronized void updateQueue(final long[] flashing) {
    mFlashingQueue.clear();
    for (long value : flashing) {
        mFlashingQueue.add(value);
    }
}