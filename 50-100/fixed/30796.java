private void notifyChangeCameraEvent(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
    java.util.Map<java.lang.String, java.lang.Object> arguments = new java.util.HashMap<>();
    arguments.put("position", java.util.Arrays.asList(cameraPosition.target.latitude, cameraPosition.target.longitude));
    objectRegistry.getRemoteObjectForObject(mapHolderView).notify(com.eclipsesource.tabris.maps.MapCameraChangeListener.EVENT_CHANGE_CAMERA, arguments);
}