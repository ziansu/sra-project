public void setFooter(com.universalrefresh.library.base.BaseFooter footer) {
    if (footer != null) {
        mFooterView = footer.get();
        if ((mFooterView) != null) {
            mIsEnablePullUp = true;
            addView(mFooterView, getChildCount());
        }
        mFooter = footer;
    }else {
        mIsEnablePullUp = false;
        mFooterView = null;
    }
}