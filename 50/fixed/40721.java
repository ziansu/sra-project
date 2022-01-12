public boolean bind() {
    android.content.Intent i = new android.content.Intent(mContext, org.tlc.whereat.services.LocationService.class);
    return mContext.bindService(i, mLocationServiceConnection, Context.BIND_AUTO_CREATE);
}