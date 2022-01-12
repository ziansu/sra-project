@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    if ((position == 0) && (positionOffsetPixels == 0)) {
        finish();
    }
    if (position == 0) {
        ((me.ccrama.redditslide.Activities.CommentsScreenSingle.OverviewPagerAdapter) (pager.getAdapter())).blankPage.doOffset(positionOffset);
        pager.setBackgroundColor(adjustAlpha((positionOffset * 0.7F)));
    }
}