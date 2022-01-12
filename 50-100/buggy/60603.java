@java.lang.Override
public void onPictureTaken(byte[] data, android.hardware.Camera camera) {
    camera.setParameters(previewParams);
    if (data != null) {
        new com.commonsware.cwac.camera.ImageCleanupTask(getContext(), data, cameraId, xact).start();
    }
    if (!(xact.useSingleShotMode())) {
        startPreview();
    }
}