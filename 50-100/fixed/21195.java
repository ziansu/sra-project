@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.e(com.fourthwardcoder.android.volumemanager.fragments.ProfileMainFragment.TAG, "onResume()");
    if ((mProfileType) == (LOCATION_PROFILE_LIST))
        mGoogleApiClient.connect();
    
    if ((mProfileAdapter) != null)
        notifyListViewChanged();
    
}