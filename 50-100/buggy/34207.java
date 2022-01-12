private void setUpClusterer() {
    mClusterManager = new com.google.maps.android.clustering.ClusterManager<com.dev.app.futuremd.data.DoctorLocationItem>(getContext().getApplicationContext(), mMap);
    mClusterManager.setRenderer(new com.dev.app.futuremd.FindDoctorFragment.OwnIconRendered(getContext().getApplicationContext(), mMap, mClusterManager));
    mMap.setOnCameraIdleListener(mClusterManager);
    mMap.setOnMarkerClickListener(mClusterManager);
}