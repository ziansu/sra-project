public void goToNextPage() {
    if ((mViewPager.getCurrentItem()) < ((mViewPagerAdapter.getCount()) - 1)) {
        mViewPager.setCurrentItem(((mViewPager.getCurrentItem()) + 1), true);
    }
}