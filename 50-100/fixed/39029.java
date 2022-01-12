@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    if (((linearLayout.getChildCount()) > 0) && ((viewPager.getWidth()) > 0)) {
        movingIndicator.setX(((((getMeasuredWidth()) * position) / (linearLayout.getChildCount())) + (((positionOffsetPixels * (getMeasuredWidth())) / (viewPager.getWidth())) / (linearLayout.getChildCount()))));
    }
}