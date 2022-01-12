@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    mScale = com.thedeveloperworldisyours.carouselviewpager.CustomPagerAdapter.SMALL_SCALE;
    return com.thedeveloperworldisyours.carouselviewpager.CustomFragment.newInstance(mContext, position, mScale);
}