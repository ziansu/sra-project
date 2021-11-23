@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    if (isShowTools) {
        showOrHideTools();
    }
}