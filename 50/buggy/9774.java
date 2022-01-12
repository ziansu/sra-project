@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (com.jstakun.gms.android.location.AndroidDevice.isBetterLocation(location, com.jstakun.gms.android.config.ConfigurationManager.getInstance().getLocation())) {
        com.jstakun.gms.android.config.ConfigurationManager.getInstance().setLocation(location);
        mLocationHandler.sendEmptyMessage(com.jstakun.gms.android.location.GmsLocationServicesManager.UPDATE_LOCATION);
    }
}