@java.lang.Override
public void onProviderDisabled(final java.lang.String provider) {
    if (provider.equals(LocationManager.GPS_PROVIDER)) {
        org.kei.android.phone.cellhistory.CellHistoryApp.addLog(app, (("onProviderDisabled(" + provider) + ")"));
        disabled = true;
        reset();
        publishEvent(org.kei.android.phone.cellhistory.services.tasks.GpsServiceTask.EVENT_DISABLED);
    }
}