public void setHeader(com.universalrefresh.library.base.BaseHeader header) {
    if (header != null) {
        mHeaderView = header.get();
        if ((mHeaderView) != null) {
            mIsEnablePullDown = true;
            addView(mHeaderView, 0);
        }
        mHeader = header;
    }else {
        mIsEnablePullDown = false;
        mHeaderView = null;
    }
}