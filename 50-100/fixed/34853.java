@java.lang.Override
public void onPageScrollStateChanged(int state) {
    switch (state) {
        case android.support.v4.view.ViewPager.SCROLL_STATE_IDLE :
            scrollToChild(pager.getCurrentItem(), 0);
            break;
        case android.support.v4.view.ViewPager.SCROLL_STATE_DRAGGING :
            positionOnDraging = pager.getCurrentItem();
            break;
        case android.support.v4.view.ViewPager.SCROLL_STATE_SETTLING :
            int positionOnSettling = pager.getCurrentItem();
            changeTabsTextColor(positionOnSettling);
            invalidate();
            break;
        default :
            break;
    }
    if ((delegatePageListener) != null) {
        delegatePageListener.onPageScrollStateChanged(state);
    }
}