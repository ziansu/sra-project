private void updateHeaderOnOffsetChange(int deltaOffset, final int targetOffset) {
    if ((mHeader) instanceof com.huangxueqin.listcomponent.header.BaseHeaderView) {
        final com.huangxueqin.listcomponent.header.BaseHeaderView bhv = ((com.huangxueqin.listcomponent.header.BaseHeaderView) (mHeader));
        if ((mState) == (com.huangxueqin.listcomponent.PullRefreshLayout.STATE_PULL_DOWN)) {
            post(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    bhv.onPullDown(targetOffset, mRefreshOffset);
                }
            });
        }
    }
    mHeader.offsetTopAndBottom(deltaOffset);
}