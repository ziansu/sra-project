@java.lang.Override
public void onPageScrolled(int i, float v, int i1) {
    int pos = viewPager.getCurrentItem();
    tabHost.setSelectedNavigationItem(pos);
}