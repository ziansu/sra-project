private void addFooter() {
    android.widget.FrameLayout bottomViewLayout = new android.widget.FrameLayout(getContext());
    com.lcodecore.tkrefreshlayout.LayoutParams layoutParams2 = new com.lcodecore.tkrefreshlayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0);
    layoutParams2.addRule(com.lcodecore.tkrefreshlayout.ALIGN_PARENT_BOTTOM);
    layoutParams2.addRule(com.lcodecore.tkrefreshlayout.CENTER_VERTICAL);
    bottomViewLayout.setLayoutParams(layoutParams2);
    mBottomLayout = bottomViewLayout;
    this.addView(mBottomLayout);
    if ((mBottomView) == null) {
        com.lcodecore.tkrefreshlayout.Footer.BottomProgressView mProgressView = new com.lcodecore.tkrefreshlayout.Footer.BottomProgressView(getContext());
        setBottomView(mProgressView);
    }
}