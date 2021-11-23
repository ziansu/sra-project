public void release() {
    if (mRefreshLayout.equalsOnHookUIRefreshCompleteCallback(mHookUIRefreshCompleteCallBack))
        mRefreshLayout.setOnHookUIRefreshCompleteCallback(null);
    
}