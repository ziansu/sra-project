public void callTakePicture(int returnType, int encodingType) {
    if (cordova.hasPermission(org.apache.cordova.camera.CameraLauncher.permissions[0])) {
        takePicture(returnType, encodingType);
    }else {
        getReadPermission(org.apache.cordova.camera.CameraLauncher.TAKE_PIC_SEC);
    }
}