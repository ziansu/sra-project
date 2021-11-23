@java.lang.Override
public void onPageSelected(int position) {
    final android.animation.Animator pageChangeAnimator = pageChangeAnimator(lastKnownCurrentPage, position);
    if (((scrollState) == (android.support.v4.view.ViewPager.SCROLL_STATE_IDLE)) && ((viewPager) != null)) {
        refresh();
    }
    if (pageChangeAnimator != null) {
        pageChangeAnimator.start();
    }
    lastKnownCurrentPage = position;
}