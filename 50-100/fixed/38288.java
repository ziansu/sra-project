private void callGetWebService() {
    try {
        showLoadingDialog();
        callRoomApi();
    } catch (java.lang.Exception e) {
        android.util.Log.e(LOG_TAG, ("RuntimeException : " + (e.getMessage())), e);
        closeLoadingDialog();
        showErrorDialog().show();
    }
}