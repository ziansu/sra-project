public void release() {
    if ((mRefreshLayout) != null) {
        if (mRefreshLayout.equalsOnHookUIRefreshCompleteCallback(mHookUIRefreshCompleteCallBack))
            mRefreshLayout.setOnHookUIRefreshCompleteCallback(null);
        
    }
}