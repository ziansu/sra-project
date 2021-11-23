private void enableIoioGps(boolean clearDialog) {
    if (clearDialog) {
        removeDialog(R.id.dialog_gps);
    }
    if (((lm) != null) && ((ll) != null)) {
        lm.removeUpdates(ll);
        ll = null;
    }
    org.kflog.cumulus.CumulusActivity.m_ioio.start();
    reportGpsStatus(1);
    org.kflog.cumulus.CumulusActivity.gpsEnabled = true;
}