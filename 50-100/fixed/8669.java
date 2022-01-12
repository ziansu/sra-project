@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    if ((mTabWidth) == 0) {
        mTabWidth = (mViewPager.getWidth()) / (mViewPager.getAdapter().getCount());
    }
    float translationX = (mTabWidth) * (positionOffset + position);
    setTranslationX(translationX);
}