private void setOffsetTopAndBottom(int offset) {
    mRefreshHeaderView.offsetTopAndBottom(offset);
    mRefreshView.offsetTopAndBottom(offset);
    mLayoutOffsetTop = (mHeaderViewHeight) + (getCurTop());
    invalidate();
}