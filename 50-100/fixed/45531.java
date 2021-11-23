private boolean startThreadIfNeeded() {
    if (((mDirty) && ((mThread) == null)) && ((com.nextfaze.poweradapters.data.IncrementalArrayData.getDataObserverCount()) > 0)) {
        mDirty = false;
        onLoadBegin();
        setLoading(true);
        mThread = mThreadFactory.newThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                runLoadLoop();
            }
        });
        mThread.start();
        return true;
    }
    return false;
}