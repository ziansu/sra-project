@java.lang.Override
protected void onLayout(boolean changed, int l, int t, int r, int b) {
    super.onLayout(changed, l, t, r, b);
    leftBorder = getChildAt(0).getLeft();
    rightBorder = getChildAt(((getChildCount()) - 1)).getRight();
}