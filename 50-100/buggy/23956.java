@java.lang.Override
public void onClick(android.view.View v) {
    new com.school.bicycle.global.UserService(this).setShowOneMark("0");
    cameraUpdate = com.amap.api.maps.CameraUpdateFactory.newCameraPosition(new com.amap.api.maps.model.CameraPosition(new com.amap.api.maps.model.LatLng(lat, lon), 17, 0, 0));
    aMap.moveCamera(cameraUpdate);
}