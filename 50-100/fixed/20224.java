public void SetupMapIfNeeded() {
    if ((com.example.idk.myuber.MapsActivity.mMap) == null) {
        com.example.idk.myuber.MapsActivity.mMap = getMapFragment().getMap();
        android.util.Log.v("MAP", com.example.idk.myuber.MapsActivity.mMap.toString());
        if ((com.example.idk.myuber.MapsActivity.mMap) != null)
            SetupMap();
        
    }else {
        SetupMap();
    }
}