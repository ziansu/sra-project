@java.lang.Override
public void onPageSelected(int position) {
    if (position == 0) {
        scanNow(null);
        mViewPager.setCurrentItem(1);
    }
}