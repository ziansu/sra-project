public void startUpdates() {
    if (servicesConnected(mContext)) {
        if (com.gmail.vanyadubik.managerplus.service.gps.GoogleLocationService.locationEnabled(mContext)) {
            locationUpdateListener.canReceiveLocationUpdates("Unable to get your location.Please turn on your device Gps");
            startLocationUpdates();
        }else {
            locationUpdateListener.cannotReceiveLocationUpdates("Unable to get your location.Please turn on your device Gps");
            android.util.Log.e(com.gmail.vanyadubik.managerplus.common.Consts.TAGLOG_GPS, "Unable to get your location.Please turn on your device Gps");
        }
    }else {
        locationUpdateListener.cannotReceiveLocationUpdates("Google play service not available");
        android.util.Log.e(com.gmail.vanyadubik.managerplus.common.Consts.TAGLOG_GPS, "Google play service not available");
    }
}