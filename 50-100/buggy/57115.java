private void initData() {
    mPresenter.getUser();
    mPage = com.framgia.wsm.screen.listrequest.ListRequestViewModel.PAGE_ONE;
    setLoading(false);
    mMonthYear = com.framgia.wsm.utils.common.DateTimeUtils.getMonthWorking(mCutOffDate);
    mQueryRequest = new com.framgia.wsm.data.model.QueryRequest();
    mQueryRequest.setMonthWorking(mMonthYear);
    mQueryRequest.setPage(java.lang.String.valueOf(mPage));
    if (!(mEventStatusFromNotifications)) {
        mCurrentStatus = mContext.getString(R.string.pending);
        mQueryRequest.setStatus(java.lang.String.valueOf(mCurrentPositionStatus));
        mCurrentPositionStatus = com.framgia.wsm.screen.listrequest.ListRequestViewModel.CURRRENT_STATUS;
    }
    mEventStatusFromNotifications = false;
    setLoadDataFirstTime(true);
}