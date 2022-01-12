@java.lang.Override
protected void onRefresh(boolean forceApiReload) {
    android.support.v4.content.Loader loader = getSupportLoaderManager().getLoader(eu.zkkn.android.barcamp.MainActivity.LOADER_SESSIONS_ID);
    if (forceApiReload) {
        ((eu.zkkn.android.barcamp.DataLoader) (loader)).loadFromApi(true);
    }else {
        loader.forceLoad();
    }
}