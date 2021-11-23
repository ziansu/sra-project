@java.lang.Override
protected void onPause() {
    super.onPause();
    dataSource.close();
    dataSource.close();
}