private void initAttrs(android.content.Context context, android.util.AttributeSet attrs) {
    if ((getChildCount()) > 1) {
        throw new java.lang.RuntimeException("WXSwipeLayout should not have more than one child");
    }
    parentHelper = new android.support.v4.view.NestedScrollingParentHelper(this);
    if ((isInEditMode()) && (attrs == null)) {
        return ;
    }
    mRefreshViewBgColor = android.graphics.Color.TRANSPARENT;
    mProgressBgColor = android.graphics.Color.TRANSPARENT;
    mProgressColor = android.graphics.Color.RED;
}