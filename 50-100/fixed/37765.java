@java.lang.Override
public void run() {
    if (isRefreshData) {
        if (((getViewPager()) instanceof com.kimeeo.library.listDataView.viewPager.directionalviewpager.DirectionalViewPager) == false) {
            getViewPager().setAdapter(getAdapter());
            gotoItem(0, true);
            setUpIndicator(mIndicator, mViewPager);
        }
    }
}