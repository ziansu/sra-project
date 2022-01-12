public synchronized void setNewData(DATA newData, melnorme.lang.utils.concurrency.ConcurrentlyDerivedData.DataUpdateTask<DATA> updateTask) {
    if ((latestUpdateTask) != updateTask) {
        melnorme.lang.utils.concurrency.ConcurrentlyDerivedData.assertTrue(updateTask.isCancelled());
    }else {
        latestUpdateTask = null;
        internalSetData(newData);
        doHandleDataChanged();
        latch.countDown();
    }
}