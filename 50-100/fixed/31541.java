@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if ((android.content.pm.PackageManager.PERMISSION_DENIED) != (checkSelfPermission(Manifest.permission.SEND_SMS))) {
        doSMSAction();
    }else {
        if (shouldShowRequestPermissionRationale(Manifest.permission.SEND_SMS)) {
            showDialogExplainingWhyPermissionNeeded();
            requestPermissions(new java.lang.String[]{ Manifest.permission.SEND_SMS }, PERMISSION_REQUEST_CODE);
        }else {
        }
    }
}