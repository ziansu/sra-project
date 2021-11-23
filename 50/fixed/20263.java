@java.lang.Override
public void onMapClick(com.baidu.mapapi.model.LatLng latLng) {
    hmPos = latLng;
    marker.setPosition(latLng);
}