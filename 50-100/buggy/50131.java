@java.lang.Override
public void run() {
    android.util.Log.d(wisc.drivesense.activity.MainActivity.TAG, "No GPS, resetting speed display.");
    tvSpeed.setText("--.--");
    Units.userFacingDouble distance = wisc.drivesense.utility.Units.largeDistance(boundTripService.getCurtrip().getDistance(), metricUnits);
    tvTotalDistance.setText(java.lang.String.format("*%.2f", distance.value));
}