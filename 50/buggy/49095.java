public void onViewPagerPageChanged() {
    scrollDown(lastYOffset);
    android.view.View visibleView = com.ihandy.a2014011425.materialviewpager.Utils.getTheVisibileView(scrollViewList);
    if (!(com.ihandy.a2014011425.materialviewpager.Utils.canScroll(visibleView))) {
        followScrollToolbarLayout(0);
        onMaterialScrolled(visibleView, 0);
    }
}