@java.lang.Override
public void onDestroy() {
    locationManager.removeUpdates(locationListener);
    if ((trackPoints.size()) > 0) {
        new ru.qsolution.vodovoz.driver.AsyncTasks.SendCoordinatesTask().execute(authKey, trackIdResult.getResult(), trackPoints);
    }
    android.util.Log.i("Location", ("stopping location updates for route list #" + (ru.qsolution.vodovoz.driver.Services.LocationService.RouteListId)));
    super.onDestroy();
}