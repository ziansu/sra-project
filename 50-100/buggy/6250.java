@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    int displace = -positionOffsetPixels;
    int displaceNew = (-positionOffsetPixels) + (mSwipePager.getWidth());
    if (positionOffset > 0.999) {
        mBackdrop.setX(0);
        mNewBackdrop.setX(0);
    }else {
        setTitle(position, positionOffset);
        mBackdrop.setX(displace);
        mNewBackdrop.setX(displaceNew);
    }
    setImage(position);
}