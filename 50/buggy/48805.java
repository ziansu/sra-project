private void SetLastLocation(com.google.android.gms.maps.model.LatLng latLng) {
    if (latLng != null)
        Utils.SharedPreferencesUtil.SaveLocationInSharedPreferences(getContext(), latLng.latitude, latLng.longitude, new java.util.Date());
    
    lastLocation = latLng;
}