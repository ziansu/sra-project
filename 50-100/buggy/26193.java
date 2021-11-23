private void enableIoioGps(boolean clearDialog) {
    if (clearDialog) {
        removeDialog(R.id.dialog_gps);
    }
    org.kflog.cumulus.CumulusActivity.m_ioio.start();
    reportGpsStatus(1);
    org.kflog.cumulus.CumulusActivity.gpsEnabled = true;
    if (((lm) != null) && ((ll) != null)) {
        lm.removeUpdates(ll);
        ll = null;
    }
}