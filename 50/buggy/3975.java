private void remove(T resource) {
    try {
        mLock.lock();
        mResources.remove(resource);
    } finally {
        mLock.unlock();
    }
}