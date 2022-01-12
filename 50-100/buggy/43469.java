@java.lang.Override
public void onPageChanged(int currentPage) {
    if ((mActivity.getSteps()[currentPage]) == null)
        return ;
    
    android.util.Log.d(com.amagh.bakemate.adapters.StepSectionAdapter.TAG, ("Media Source: " + (mMediaSourceArray.get(currentPage))));
    mActivity.getSteps()[mCurrentPage].stopPlayer();
    mActivity.getSteps()[currentPage].setPlayer(mActivity, mMediaSourceArray.get(currentPage));
    mCurrentPage = currentPage;
}