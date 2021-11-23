@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    if ((mCachedPosts) == null) {
        mPosts = com.mishiranu.dashchan.content.CacheManager.getInstance().deserializePosts(mChanName, mBoardName, mThreadNumber, mHolder);
    }else
        mPosts = mCachedPosts;
    
    mPostItems = com.mishiranu.dashchan.async.ReadPostsTask.wrapPosts(mPosts, mChanName, mBoardName);
    return ((mPostItems) != null) && ((mPostItems.length) > 0);
}