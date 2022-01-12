private void updatePersistentStore() {
    try {
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(mFile);
        java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(mInMemoryQueue);
        timber.log.Timber.d(au.com.roadhouse.localdownloadmanager.PersistentQueue.TAG, "handleMessage: Updated persistent storage");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}