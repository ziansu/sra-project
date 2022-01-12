@java.lang.Override
public void onStart() {
    super.onStart();
    if ((mMap) != null)
        padMapElements(mMap);
    
    android.util.Log.i(ru.sukharev.pathtracker.ui.MapActivity.TAG, "activity start");
    if ((mMap) != null)
        setMapType();
    
    updateInfoFragmentIfExists();
    mNavigationDrawerFragment.reloadList();
    mMap.setMyLocationEnabled(true);
}