@java.lang.Override
public void onBackPressed() {
    globalHandler.melodySmartDeviceHandler.disconnect();
    super.onBackPressed();
    finish();
}