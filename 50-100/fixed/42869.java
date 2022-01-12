@java.lang.Override
public void onNestedScroll(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.support.design.widget.AppBarLayout child, android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
    super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
    bindChild(child);
    if ((mAppBarLayout.mListener) != null) {
        mAppBarLayout.mListener.onNestedScrolling();
    }
}