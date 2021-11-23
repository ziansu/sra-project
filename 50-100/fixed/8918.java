@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    int count = ((listener) instanceof com.heinrichreimersoftware.materialintro.view.FadeableViewPager.OnOverscrollPageChangeListener) ? com.heinrichreimersoftware.materialintro.view.FadeableViewPager.super.getAdapter().getCount() : getAdapter().getCount();
    listener.onPageScrolled(java.lang.Math.min(position, (count - 1)), (position < count ? positionOffset : 0), (position < count ? positionOffsetPixels : 0));
}