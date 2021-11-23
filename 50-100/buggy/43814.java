@java.lang.Override
public void setCurrentStatusFromNotifications() {
    mEventStatusFromNotifications = true;
    mMonthYear = com.framgia.wsm.utils.common.DateTimeUtils.getMonthWorking(mCutOffDate);
    setDialogManager(mMonthYear);
    setPage(com.framgia.wsm.screen.listrequest.ListRequestViewModel.PAGE_ONE);
    setCurrentStatus(null);
    setMonthYearNotGetData(null);
    mCurrentPositionStatus = com.framgia.wsm.utils.TypeStatus.NONE;
    mQueryRequest.setStatus(null);
    mQueryRequest.setMonthWorking(null);
    mPresenter.getListAllRequest(mRequestType, mQueryRequest, false);
}