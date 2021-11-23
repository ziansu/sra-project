@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    fetchDataQuery.keepSynced(false);
}