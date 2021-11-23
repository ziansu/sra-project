@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String address) {
    android.util.Log.d("Search", "query text submit");
    geoCodeTypedAddress(address);
    mSearchSearchView.clearFocus();
    mLocationSearchView.clearFocus();
    return true;
}