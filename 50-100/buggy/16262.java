@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_FRAGMENT_TAG, mFragmentTag);
    outState.putDouble(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_LATITUDE, mLatitude);
    outState.putDouble(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_LONGITUDE, mLongitude);
    outState.putBoolean(com.huhx0015.doordashchallenge.view.activities.MainActivity.INSTANCE_IS_LOCATION_PERMISSIONS_ASKED, mIsLocationPermissionsAsked);
}