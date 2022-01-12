@java.lang.Override
protected void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    final java.lang.String message = resultData.getString(Constants.RESULT_DATA_KEY);
    if (resultCode == (me.dcii.flowmap.util.Constants.SUCCESS_RESULT)) {
        mCurrentLocation = resultData.getParcelable(Constants.LOCATION_DATA_EXTRA);
        if ((mCurrentLocation) != null) {
            mLocationChangeListener.onLocationChanged(mCurrentLocation);
            updateLocation();
        }
    }
}