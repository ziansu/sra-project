@java.lang.Override
public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams params) {
    mContentView = view;
    android.widget.FrameLayout.LayoutParams layoutParams = ((android.widget.FrameLayout.LayoutParams) (params));
    int titleHeight = this.getResources().getDimensionPixelSize(R.dimen.title_height);
    layoutParams.topMargin = titleHeight + ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT) ? getStatusBarHeight() : 0);
    if ((mContentParent.getChildCount()) > 1) {
        mContentParent.removeViewAt(1);
    }
    mContentParent.addView(mContentView, layoutParams);
    updateView();
}