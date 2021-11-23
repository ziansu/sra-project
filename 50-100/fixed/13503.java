@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, final int verticalOffset) {
    final boolean appBarCollapsed = ((mPrevVerticalOffset) > verticalOffset) && (verticalOffset == (-550));
    mPrevVerticalOffset = verticalOffset;
    if (appBarCollapsed) {
        mMarkdownView.setScrollable();
    }
}