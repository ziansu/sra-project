@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    mFrame = new android.widget.FrameLayout(mContext);
    mFrame.setLayoutParams(new android.view.ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    for (int i = 0; i < (getChildCount()); ++i) {
        android.view.View child = getChildAt(i);
        removeView(child);
        mFrame.addView(child);
    }
    addView(mFrame);
}