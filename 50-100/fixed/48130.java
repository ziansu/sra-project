@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    if ((mCachedThreads) != null)
        mThreads = mCachedThreads;
    else
        mThreads = com.mishiranu.dashchan.content.CacheManager.getInstance().deserializeThreads(mChanName, mBoardName, mHolder);
    
    mPostItems = com.mishiranu.dashchan.async.ReadThreadsTask.wrapThreads(mThreads, mChanName, mBoardName);
    return (((mPostItems) != null) && ((mPostItems.length) > 0)) && ((mPostItems[0]) != null);
}