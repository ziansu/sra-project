@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == (com.thedeveloperworldisyours.carouselviewpager.MainActivity.FIRST_PAGE))
        mScale = com.thedeveloperworldisyours.carouselviewpager.CustomPagerAdapter.BIG_SCALE;
    else
        mScale = com.thedeveloperworldisyours.carouselviewpager.CustomPagerAdapter.SMALL_SCALE;
    
    position = position % (com.thedeveloperworldisyours.carouselviewpager.MainActivity.PAGES);
    return com.thedeveloperworldisyours.carouselviewpager.CustomFragment.newInstance(mContext, position, mScale);
}