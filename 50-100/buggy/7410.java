public void startUpdates() {
    if (servicesConnected(mContext)) {
        if (com.gmail.vanyadubik.managerplus.service.gps.GoogleLocationService.locationEnabled(mContext)) {
            locationUpdateListener.canReceiveLocationUpdates();
            startLocationUpdates();
        }else {
            locationUpdateListener.cannotReceiveLocationUpdates();
            android.util.Log.e(com.gmail.vanyadubik.managerplus.common.Consts.TAGLOG_GPS, "Unable to get your location.Please turn on your device Gps");
        }
    }else {
        locationUpdateListener.cannotReceiveLocationUpdates();
        android.util.Log.e(com.gmail.vanyadubik.managerplus.common.Consts.TAGLOG_GPS, "Google play service not available");
    }
}