@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String address) {
    geoCodeTypedAddress(address);
    mSearchSearchView.clearFocus();
    mLocationSearchView.clearFocus();
    return true;
}