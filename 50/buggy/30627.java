@java.lang.Override
public void onCameraChange(com.mapbox.mapboxsdk.camera.CameraPosition position) {
    setCenterCoordinates(width, height, projection);
    positionZoom = position.zoom;
    showDoors();
    centerUser();
}