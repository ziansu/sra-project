public void setHeader(com.universalrefresh.library.base.BaseHeader header) {
    if ((enablePullDown()) && (header != null)) {
        mHeaderView = header.get();
        if ((mHeaderView) != null) {
            addView(mHeaderView, 0);
            mIsEnablePullDown = true;
        }
        mHeader = header;
    }else {
        mIsEnablePullDown = false;
    }
}