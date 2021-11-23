@java.lang.Override
protected void onDestroy() {
    mainActivityHelper.saveDatabase();
    super.onDestroy();
}