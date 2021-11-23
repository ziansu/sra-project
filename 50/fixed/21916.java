@java.lang.Override
public void onPageSelected(int position) {
    if (position == 0) {
        mViewPager.setCurrentItem(0);
        scanNow(null);
    }
}