@java.lang.Override
public void onProviderDisabled(final java.lang.String provider) {
    org.kei.android.phone.cellhistory.CellHistoryApp.addLog(app, (("onProviderDisabled(" + provider) + ")"));
    if (provider.equals(LocationManager.GPS_PROVIDER)) {
        disabled = true;
        reset();
        publishEvent(org.kei.android.phone.cellhistory.services.tasks.GpsServiceTask.EVENT_DISABLED);
    }
}