@java.lang.Override
public void onProviderEnabled(final java.lang.String provider) {
    org.kei.android.phone.cellhistory.CellHistoryApp.addLog(app, (("onProviderEnabled(" + provider) + ")"));
    if (provider.equals(LocationManager.GPS_PROVIDER)) {
        disabled = false;
        reset();
        publishEvent(org.kei.android.phone.cellhistory.services.tasks.GpsServiceTask.EVENT_ENABLED);
        publishEvent(org.kei.android.phone.cellhistory.services.tasks.GpsServiceTask.EVENT_WAIT_FOR_SATELLITES);
    }
}