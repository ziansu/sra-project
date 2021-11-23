@java.lang.Override
public void onCameraChange(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
    android.util.Log.d("m", "=====================camera move=====================");
    java.lang.System.out.println(getBoundedMarkers(markerArray));
}