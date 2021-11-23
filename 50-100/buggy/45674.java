public void goToNextPage() {
    if ((mViewPager.getCurrentItem()) == ((mViewPagerAdapter.getCount()) - 1)) {
    }else {
        mViewPager.setCurrentItem(((mViewPager.getCurrentItem()) + 1), true);
    }
}