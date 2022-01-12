@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    android.content.Context context = getContext();
    android.widget.FrameLayout headViewLayout = new android.widget.FrameLayout(context);
    com.cjj.LayoutParams layoutParams = new com.cjj.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0);
    layoutParams.gravity = android.view.Gravity.TOP;
    headViewLayout.setLayoutParams(layoutParams);
    mHeadLayout = headViewLayout;
    this.addView(mHeadLayout);
    mChildView = getChildAt(0);
    mHeadHeight = com.cjj.Util.dip2px(getContext(), DEFAULT_HEIGHT);
}