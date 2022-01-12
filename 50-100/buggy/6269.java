@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    if (getMyApplication().getSettings().isInternetConnectionAvailable(true)) {
        getMyApplication().getLocationProvider().redownloadAGPS();
        if ((getMyApplication().getLocationProvider().agpsDownloaded()) == true) {
            getMyApplication().getSettings().AGPS_DATA_LAST_TIME_DOWNLOADED.set(java.lang.System.currentTimeMillis());
        }else {
            getMyApplication().getSettings().AGPS_DATA_LAST_TIME_DOWNLOADED.set(0L);
        }
    }
    return true;
}