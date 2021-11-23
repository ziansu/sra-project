protected void onDestroy() {
    com.example.devicechecker.ResultHandler handler = new com.example.devicechecker.ResultHandler(this);
    handler.removeResultFile();
    super.onDestroy();
    android.os.Process.killProcess(android.os.Process.myPid());
}