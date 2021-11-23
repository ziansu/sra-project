@java.lang.Override
public void onViewPagerDataChanged(android.support.v4.view.ViewPager viewPager) {
    for (int j = 0; j < 17; j++) {
        mTabLayout.newTab();
    }
    mTabLayout.setupWithViewPager(viewPager);
}