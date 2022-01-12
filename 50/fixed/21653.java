private synchronized void updateQueue(long[] flashing) {
    mFlashingQueue.clear();
    mFlashingQueue.add(0L);
    for (long value : flashing) {
        mFlashingQueue.add(value);
    }
}