@java.lang.Override
public void onPageSelected(int position) {
    if ((placeHoderHeaderLayoutList) == null) {
        return ;
    }
    com.stickheaderlayout.PlaceHoderHeaderLayout placeHoderHeaderLayout = placeHoderHeaderLayoutList.valueAt(position);
    android.view.View mStickheader = mStickHeaderLayout.getStickHeaderView();
    placeHoderHeaderLayout.adjustScroll(((int) ((mStickheader.getHeight()) + (mStickheader.getTranslationY()))), mStickheader.getHeight());
}