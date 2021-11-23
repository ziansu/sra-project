@java.lang.Override
public void onPageChanged(int currentPage) {
    if ((mActivity.getSteps()[currentPage]) == null)
        return ;
    
    mActivity.getSteps()[mCurrentPage].stopPlayer();
    mActivity.getSteps()[currentPage].setPlayer(mActivity, mMediaSourceArray.get(currentPage));
    mCurrentPage = currentPage;
}