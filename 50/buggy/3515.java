public void onDestroy() {
    super.onDestroy();
    android.os.Process.killProcess(android.os.Process.myPid());
}