@java.lang.Override
public void onGetUserSuccess(com.framgia.wsm.data.model.User user) {
    if ((user == null) || ((user.getCompany()) == null)) {
        return ;
    }
    mCutOffDate = user.getCompany().getCutOffDate();
    setMonthYearNotGetData(com.framgia.wsm.utils.common.DateTimeUtils.getMonthWorking(mCutOffDate));
    mListRequestAdapter.updateUser(user);
}