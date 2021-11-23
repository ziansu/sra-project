@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.i("HS U", "onCreate");
    setContentView(R.layout.activity_hsmain);
    initViews();
    java.lang.String myMobile = HSApplication.asp.read(SPAppInner.MOBILE, "");
    if (android.text.TextUtils.isEmpty(myMobile))
        showMoblieInputDialog();
    else {
        phone_status.setText(("我的号码:" + myMobile));
        com.aiqing.niuniuheardsensor.Utils.api.HSApiHelper.myMobile = myMobile;
        checkAndUploadRecords();
        startCheckThread();
    }
}