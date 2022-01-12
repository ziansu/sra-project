private void configMap() {
    if ((mMap) != null) {
        mMap.setMyLocationEnabled(true);
        mMap.setOnInfoWindowClickListener(this);
        mClusterManager = new com.google.maps.android.clustering.ClusterManager(getActivity(), mMap);
        mClusterManager.setRenderer(new org.akvo.flow.ui.fragment.MapFragment.PointRenderer(mMap));
        mMap.setOnMarkerClickListener(mClusterManager);
        mMap.setOnCameraIdleListener(new com.google.android.gms.maps.GoogleMap.OnCameraIdleListener() {
            @java.lang.Override
            public void onCameraIdle() {
                cluster();
            }
        });
        centerMap(null);
    }
}