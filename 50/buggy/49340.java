@butterknife.OnClick(value = R.id.scroll_left_button)
protected void scrollLeft() {
    if (mCustomScrollView.isScrolling()) {
        mCustomScrollView.stopScroll();
    }
    mCustomScrollView.scrollBy((-1));
}