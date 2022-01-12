@java.lang.Override
public void onClick(android.view.View v) {
    if (((mExoPlayer) != null) && ((mStepId) != ((mStepArrayList.size()) - 1)))
        mExoPlayer.stop();
    
    if (((mStepArrayList) != null) && ((mStepId) != ((mStepArrayList.size()) - 1))) {
        mPager.setCurrentItem(((mStepId) + 1));
    }
}