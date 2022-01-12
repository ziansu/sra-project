public void release(T resource) {
    if (resource != null) {
        mResources.add(resource);
        try (alluxio.resource.LockResource r = new alluxio.resource.LockResource(mTakeLock)) {
            mNotEmpty.signal();
        }
    }
}