@java.lang.Override
public void onAutoFocus(boolean success, android.hardware.Camera camera) {
    camera.takePicture(new android.hardware.Camera.ShutterCallback() {
        @java.lang.Override
        public void onShutter() {
        }
    }, null, new android.hardware.Camera.PictureCallback() {
        @java.lang.Override
        public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
            saveScaledPhoto(data, true);
        }
    });
}