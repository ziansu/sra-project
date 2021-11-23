@java.lang.Override
public void onPageSelected(int position) {
    if ((scrollingState) == (android.support.v4.view.ViewPager.SCROLL_STATE_IDLE)) {
        updateIndicatorPosition(position, 0);
    }
    tabWidget.setCurrentTab(position);
}