@java.lang.Override
protected void onDestroy() {
    com.orm.SugarContext.terminate();
    super.onDestroy();
}