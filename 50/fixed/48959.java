@java.lang.Override
protected void onDestroy() {
    this.stopService(service);
    gameThreadRunning = false;
    dbHelper.close();
    super.onDestroy();
}