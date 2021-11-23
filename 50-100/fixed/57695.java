private synchronized void serviceExecuteQueue(com.mooshim.mooshimeter.common.BLEUtil.BLEUtilRequest add) {
    if (add != null) {
        if ((mExecuteQueue.size()) != 0) {
            android.util.Log.e(com.mooshim.mooshimeter.common.BLEUtil.TAG, "Adding to BLEUtil queue with an item already in the queue.  This is probably not what you intended to do.");
        }
        mExecuteQueue.addLast(add);
    }
    if (((mRunning) == null) && ((mExecuteQueue.size()) > 0)) {
        mRunning = mExecuteQueue.remove(0);
        mRunning.payload.run();
    }
}