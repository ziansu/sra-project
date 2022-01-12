@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.e(com.fourthwardcoder.android.volumemanager.fragments.ProfileMainFragment.TAG, "onResume()");
    if ((mProfileType) == (LOCATION_PROFILE_LIST))
        mGoogleApiClient.connect();
    
    getLoaderManager().initLoader(com.fourthwardcoder.android.volumemanager.fragments.ProfileMainFragment.PROFILE_LOADER, null, this).forceLoad();
    if ((mProfileAdapter) != null) {
        android.util.Log.e(com.fourthwardcoder.android.volumemanager.fragments.ProfileMainFragment.TAG, "onResume(): notify listview changed");
        notifyListViewChanged();
    }else {
        android.util.Log.e(com.fourthwardcoder.android.volumemanager.fragments.ProfileMainFragment.TAG, "profile adapter is null!");
    }
}