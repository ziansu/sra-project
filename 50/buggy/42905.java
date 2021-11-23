@org.androidannotations.annotations.AfterViews
protected void init() {
    initToolbar();
    initDrawer();
    com.noveogroup.android.log.Log.d("Storage path: %s", storageUtils.getExternalStoragePath());
    hideProgress();
}