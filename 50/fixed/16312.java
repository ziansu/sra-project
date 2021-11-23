@java.lang.Override
protected void confirm() {
    android.util.Log.d("looking up: ", mScanResult);
    sRequestManager.requestSearchByCode(mScanResult, mUserId, mAuthToken, new phc.android.Services.ServicesScannerConfirmationFragment.SearchByCodeResponseListener(), new phc.android.Services.ServicesScannerConfirmationFragment.SearchByCodeErrorListener());
}