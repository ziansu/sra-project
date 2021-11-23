@java.lang.Override
public void onViewPositionChanged(android.view.View changedView, int left, int top, int dx, int dy) {
    if (changedView == (mContentView)) {
        adjustMenuItemViews(dx);
    }
    invalidate();
}