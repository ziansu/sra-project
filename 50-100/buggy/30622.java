@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    int maxScroll = appBarLayout.getTotalScrollRange();
    if ((maxScroll + verticalOffset) == 0) {
        collapsingToolbarLayout.setTitle(mTitle);
        mIsTitleShown = true;
        toolbar.setBackgroundColor(mMutedColor);
    }else
        if (mIsTitleShown) {
            collapsingToolbarLayout.setTitle("");
            mIsTitleShown = false;
            toolbar.setBackgroundColor(getResources().getColor(R.color.trans));
        }
    
}