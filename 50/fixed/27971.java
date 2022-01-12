@java.lang.Override
public void onScrolled(int dx, int dy) {
    super.onScrolled(dx, dy);
    if ((null != (mOnLastItemVisibleListener)) && (isLastItemVisible())) {
        mOnLastItemVisibleListener.onLastItemVisible();
    }
}