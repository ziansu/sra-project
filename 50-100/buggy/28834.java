@java.lang.Override
public void onPageSelected(int position) {
    int count = ((listener) instanceof com.heinrichreimersoftware.materialintro.view.FadeableViewPager.OnOverscrollPageChangeListener) ? com.heinrichreimersoftware.materialintro.view.FadeableViewPager.super.getAdapter().getCount() : getAdapter().getCount();
    listener.onPageSelected(java.lang.Math.min(position, count));
}