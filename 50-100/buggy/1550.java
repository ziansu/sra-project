@java.lang.Override
public void onResume() {
    super.onResume();
    if ((geolocation) == null) {
        geolocation = app.startGeo(locationUpdater);
    }
    if (refreshOnResume) {
        notifyDataSetChanged();
        refreshOnResume = false;
    }
    if ((cache) != null) {
        cache.setChangeNotificationHandler(cacheChangeNotificationHandler);
    }
}