private void initHeaderViewToRefresh(int deltaY) {
    int topDistance = UpdateHeadViewMarginTop(deltaY);
    if ((topDistance < 0) && (topDistance > (-(headViewHeight)))) {
        mBaseHeaderAdapter.pullViewToRefresh(deltaY);
        mHeaderState = com.sak.ultilviewlib.UltimateRefreshView.PULL_TO_REFRESH;
    }else
        if ((topDistance > 0) && ((mHeaderState) != (com.sak.ultilviewlib.UltimateRefreshView.RELEASE_TO_REFRESH))) {
            mBaseHeaderAdapter.releaseViewToRefresh(deltaY);
            mHeaderState = com.sak.ultilviewlib.UltimateRefreshView.RELEASE_TO_REFRESH;
        }
    
}