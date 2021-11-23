public void sendScrollMessage(long delayTimeInMills) {
    mHandler.removeMessages(tv.guide.pager.widget.GuideViewPage.SCROLL_WHAT);
    if ((mState) == (tv.guide.pager.model.ViewPagerState.RIGHT_EDGE)) {
        mHandler.sendEmptyMessage(tv.guide.pager.widget.GuideViewPage.SCROLL_WHAT2);
    }else {
        mHandler.sendEmptyMessageDelayed(tv.guide.pager.widget.GuideViewPage.SCROLL_WHAT, delayTimeInMills);
    }
}