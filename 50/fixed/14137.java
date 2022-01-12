@java.lang.Override
public void onPause() {
    super.onPause();
    mapView.onPause();
    mListener.hideFabsOnMapPaused();
    if ((googleMap) != null)
        Utils.SharedPreferencesUtil.SaveMapStateInSharedPrefs(getContext(), googleMap.getCameraPosition());
    
}