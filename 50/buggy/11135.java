@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    mChildView = getChildAt(0);
    addHeadView();
    addFooterView();
}