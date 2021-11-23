@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if ((fetchDataQuery) != null) {
        fetchDataQuery.keepSynced(false);
    }
}