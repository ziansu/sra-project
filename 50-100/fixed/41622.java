private void updateValuesFromBundle(android.os.Bundle savedInstanceState) {
    android.util.Log.i(edu.cornell.jjl.info4120final.MainActivity.TAG, "Updating values from bundle");
    if (savedInstanceState != null) {
        if (savedInstanceState.keySet().contains(edu.cornell.jjl.info4120final.MainActivity.LOCATION_KEY)) {
            mCurrentLocation = savedInstanceState.getParcelable(edu.cornell.jjl.info4120final.MainActivity.LOCATION_KEY);
        }
        if (savedInstanceState.keySet().contains(edu.cornell.jjl.info4120final.MainActivity.LAST_UPDATED_TIME_STRING_KEY)) {
            mLastUpdateTime = savedInstanceState.getString(edu.cornell.jjl.info4120final.MainActivity.LAST_UPDATED_TIME_STRING_KEY);
        }
    }
}