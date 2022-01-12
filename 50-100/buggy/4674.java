public void run() {
    com.rey.material.widget.CheckedTextView tv = getTabView(position);
    if (!(mScrolling)) {
        updateIndicator(tv.getLeft(), tv.getMeasuredWidth());
    }
    smoothScrollTo((((tv.getLeft()) - (((getWidth()) - (tv.getWidth())) / 2)) + (getPaddingLeft())), 0);
    mTabAnimSelector = null;
}