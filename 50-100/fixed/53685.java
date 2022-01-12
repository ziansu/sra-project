@java.lang.Override
protected void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    if (resultCode == (me.dcii.flowmap.util.Constants.SUCCESS_RESULT)) {
        mCurrentLocation = resultData.getParcelable(Constants.LOCATION_DATA_EXTRA);
        if ((mCurrentLocation) != null) {
            updateLocation();
        }
        if ((mLocationChangeListener) != null) {
            mLocationChangeListener.onLocationChanged(mCurrentLocation);
        }
    }
}