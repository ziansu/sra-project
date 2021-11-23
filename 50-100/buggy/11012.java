private void setUpLocationRequest() {
    mLocationRequest = new com.google.android.gms.location.LocationRequest();
    mLocationRequest.setInterval(java.util.concurrent.TimeUnit.SECONDS.toMillis(java.lang.Integer.parseInt(android.support.v7.preference.PreferenceManager.getDefaultSharedPreferences(mContext).getString(mContext.getString(R.string.pref_key_measure_interval), mContext.getString(R.string.pref_key_measure_interval_def)))));
    mLocationRequest.setFastestInterval(((mLocationRequest.getInterval()) / 2));
    mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
}