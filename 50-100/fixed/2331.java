@java.lang.Override
protected android.os.Parcelable onSaveInstanceState() {
    android.os.Parcelable superState = super.onSaveInstanceState();
    com.minoon.weasel.layout.CollapsingHeaderLayout.StreamPlayerViewSavedState ss = new com.minoon.weasel.layout.CollapsingHeaderLayout.StreamPlayerViewSavedState(superState);
    if ((mDragView) != null) {
        ss.dragViewPosition = mDragView.getTop();
    }
    if ((mHeaderView) != null) {
        ss.headerAlpha = mHeaderView.getAlpha();
        ss.headerTranslationY = mHeaderView.getTranslationY();
    }
    ss.contentScrollPosition = mContentScrollPosition;
    return ss;
}