@java.lang.Override
public void onError(java.lang.String error) {
    constructorCallback.onError(error);
    android.util.Log.e(com.telerik.plugins.mapbox.OfflineRegion.LOG_TAG, error);
    com.telerik.plugins.mapbox.OfflineRegion.removeOfflineRegion(getId());
}