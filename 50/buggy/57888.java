@java.lang.Override
protected void onResume() {
    datasource.open();
    super.onResume();
}