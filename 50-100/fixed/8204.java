private void onAuthSuccess(cz.kovar.petr.homevoice.zwave.ZWayProfile aProfile, retrofit2.Retrofit aAdaptor) {
    android.util.Log.v(cz.kovar.petr.homevoice.zwave.services.AuthService.LOG_TAG, "Auth success!");
    if (mCancelEvent) {
        return ;
    }
    dataContext.clear();
    apiClient.init(aProfile, aAdaptor, m_cloudCookie);
    final java.util.List<cz.kovar.petr.homevoice.zwave.dataModel.Location> locations = loadLocation();
    dataContext.addLocations(locations);
    bus.post(new cz.kovar.petr.homevoice.bus.events.AuthEvent.Success(aProfile, aAdaptor));
}