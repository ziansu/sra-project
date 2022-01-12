private void initData() {
    mPresenter.getUser();
    mPage = com.framgia.wsm.screen.listrequest.ListRequestViewModel.PAGE_ONE;
    setLoading(false);
    mQueryRequest = new com.framgia.wsm.data.model.QueryRequest();
    if (!(mEventStatusFromNotifications)) {
        mCurrentStatus = mContext.getString(R.string.pending);
        mQueryRequest.setStatus(java.lang.String.valueOf(mCurrentPositionStatus));
        mCurrentPositionStatus = com.framgia.wsm.screen.listrequest.ListRequestViewModel.CURRRENT_STATUS;
    }
    setLoadDataFirstTime(true);
}