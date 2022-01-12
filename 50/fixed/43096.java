public void callTakePicture(int returnType, int encodingType) {
    if (cordova.hasPermission(org.apache.cordova.camera.CameraLauncher.permissions[org.apache.cordova.camera.CameraLauncher.TAKE_PIC_SEC])) {
        takePicture(returnType, encodingType);
    }else {
        getReadPermission(org.apache.cordova.camera.CameraLauncher.TAKE_PIC_SEC);
    }
}