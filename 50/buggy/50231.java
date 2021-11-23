@java.lang.Override
public void onClick(android.view.View v) {
    if ((android.hardware.Camera.getNumberOfCameras()) > 0) {
        mPublisher.switchCameraFace((((mPublisher.getCamraId()) + 1) % (android.hardware.Camera.getNumberOfCameras())));
    }
}