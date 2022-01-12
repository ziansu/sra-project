@java.lang.Override
public void onError(java.lang.String error) {
    constructorCallback.onError(error);
    com.telerik.plugins.mapbox.OfflineRegion.removeOfflineRegion(getId());
}