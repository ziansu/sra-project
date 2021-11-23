@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    saveScaledPhoto(data, true);
}