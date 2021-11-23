@java.lang.Override
public void onBackPressed() {
    finish();
    disconnect();
    android.os.Process.killProcess(android.os.Process.myPid());
    super.onBackPressed();
}