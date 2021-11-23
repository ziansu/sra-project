@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    if ((mCachedPosts) != null)
        mPosts = mCachedPosts;
    else
        mPosts = com.mishiranu.dashchan.content.CacheManager.getInstance().deserializePosts(mChanName, mBoardName, mThreadNumber, mHolder);
    
    mPostItems = com.mishiranu.dashchan.async.ReadPostsTask.wrapPosts(mPosts, mChanName, mBoardName);
    return ((mPostItems) != null) && ((mPostItems.length) > 0);
}