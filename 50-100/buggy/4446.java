@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    try {
        currentResult.status = Common.STATUS_ENABLE;
        currentResult.time = location.getTime();
        currentResult.speed = ((int) (((location.getSpeed()) * 3600) / 1000));
        currentResult.accuracy = location.getAccuracy();
        currentResult.latitude = kupchinskii.ruslan.gpsup.GPS.latitude = location.getLatitude();
        currentResult.longitude = kupchinskii.ruslan.gpsup.GPS.longitude = location.getLongitude();
        kupchinskii.ruslan.gpsup.GPS.lasDate = java.util.Calendar.getInstance().getTimeInMillis();
    } catch (java.lang.Exception ex) {
    }
}