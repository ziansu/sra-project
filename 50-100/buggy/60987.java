private void setupClusterer() {
    mClusterManager = new com.google.maps.android.clustering.ClusterManager<com.fabiendem.defib68.models.defibrillator.DefibrillatorClusterItem>(getActivity(), getMap());
    mClusterRenderer = new com.fabiendem.defib68.map.DefibrillatorClusterRenderer(getActivity(), getMap(), mClusterManager);
    mClusterManager.setRenderer(mClusterRenderer);
    mClusterManager.setOnClusterItemClickListener(this);
    mClusterManager.setOnClusterItemInfoWindowClickListener(this);
    getMap().setOnCameraChangeListener(mClusterManager);
    getMap().setOnMarkerClickListener(mClusterManager);
    getMap().setOnInfoWindowClickListener(mClusterManager);
    addDefibrillatorsMarkers();
    mClusterManager.cluster();
}