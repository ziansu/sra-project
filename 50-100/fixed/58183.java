public void enableGeoFenceService() {
    if (this.mSharedPrefs.isGeofenceEnabled()) {
        if (nl.hnogames.domoticz.Utils.PermissionsUtil.canAccessLocation(mContext)) {
            final java.util.List<com.google.android.gms.location.Geofence> mGeofenceList = this.mSharedPrefs.getEnabledGeofences();
            if ((mGeofenceList != null) && ((mGeofenceList.size()) > 0)) {
                mContext.startService(new android.content.Intent(mContext, nl.hnogames.domoticz.Service.GeolocationService.class));
            }
        }
    }
}