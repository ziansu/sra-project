@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putBoolean(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_IS_LOCATION_PERMISSIONS_ASKED, mIsLocationPermissionsAsked);
    if ((mFragmentTag) != null) {
        outState.putString(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_FRAGMENT_TAG, mFragmentTag);
    }
    if ((mLatitude) != null) {
        outState.putDouble(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_LATITUDE, mLatitude);
    }
    if ((mLongitude) != null) {
        outState.putDouble(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_LONGITUDE, mLongitude);
    }
}