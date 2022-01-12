@java.lang.Override
protected void onResume() {
    super.onResume();
    getLoaderManager().getLoader(com.adonai.GsmNotify.SelectorActivity.STATUS_LOADER).onContentChanged();
}