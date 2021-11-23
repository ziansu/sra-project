@java.lang.Override
protected void onPageScrolled(int position, float offset, int offsetPixels) {
    if (((lastPagedReached) && (offset == 0)) && (!(swipeListenerCalled))) {
        onSwipeListener.onAttemptedOnLastPage();
        swipeListenerCalled = true;
    }
    lastPagedReached = (position + 1) == (getAdapter().getCount());
    super.onPageScrolled(position, offset, offsetPixels);
}