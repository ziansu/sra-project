@java.lang.Override
public void onStop() {
    if ((geolocation) != null) {
        geolocation = app.removeGeo();
    }
    if ((cache) != null) {
        cache.setChangeNotificationHandler(null);
    }
    super.onStop();
}