public void setFooter(com.universalrefresh.library.base.BaseFooter footer) {
    if ((enablePullUp()) && (footer != null)) {
        mFooterView = footer.get();
        if ((mFooterView) != null) {
            addView(mFooterView, getChildCount());
            mIsEnablePullUp = true;
        }
        mFooter = footer;
    }else {
        mIsEnablePullUp = false;
    }
}