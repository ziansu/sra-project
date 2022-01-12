@java.lang.Override
public void onStart() {
    super.onStart();
    if ((mNotificationsPref) == null) {
        return ;
    }
    final java.lang.String errMsg = com.czbix.v2ex.google.GoogleHelper.checkPlayServices(getActivity());
    if (com.google.common.base.Strings.isNullOrEmpty(errMsg)) {
        mNotificationsPref.setEnabled(true);
        return ;
    }
    showPlayServicesErrorToast(errMsg);
    mNotificationsPref.setEnabled(false);
}