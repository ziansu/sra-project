@java.lang.Override
protected void onBeforeClusterRendered(com.google.maps.android.clustering.Cluster<com.iolab.sightlocator.SightMarkerItem> cluster, com.google.android.gms.maps.model.MarkerOptions markerOptions) {
    android.util.Log.d("MyLogs", ("onBeforeClusterItemRendered, " + (cluster.getSize())));
    super.onBeforeClusterRendered(cluster, markerOptions);
}