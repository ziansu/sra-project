@java.lang.Override
public void onPageSelected(int position) {
    mCurrentItem = (position % (mCount)) + (mCount);
    setSelectDot(((mCurrentItem) % (mCount)));
    mPager.setCurrentItem(mCurrentItem);
}