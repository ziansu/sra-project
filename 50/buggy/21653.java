private synchronized void updateQueue(long[] flashing) {
    mFlashingQueue.clear();
    for (long value : flashing) {
        mFlashingQueue.add(value);
    }
}