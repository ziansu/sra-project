@java.lang.Override
public void onClick(android.view.View v) {
    mPublisher.switchCameraFace((((mPublisher.getCamraId()) + 1) % (android.hardware.Camera.getNumberOfCameras())));
}