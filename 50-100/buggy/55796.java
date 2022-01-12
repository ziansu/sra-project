public static void setZoom(float newZoom) {
    if (newZoom < 1.0F) {
        com.almalence.opencam.cameracontroller.HALv3.zoomLevel = 1.0F;
        return ;
    }
    com.almalence.opencam.cameracontroller.HALv3.zoomLevel = newZoom;
    com.almalence.opencam.cameracontroller.HALv3.zoomCropPreview = com.almalence.opencam.cameracontroller.HALv3.getZoomRect(com.almalence.opencam.cameracontroller.HALv3.zoomLevel, com.almalence.opencam.cameracontroller.HALv3.activeRect.width(), com.almalence.opencam.cameracontroller.HALv3.activeRect.height());
    com.almalence.opencam.cameracontroller.HALv3.previewRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, com.almalence.opencam.cameracontroller.HALv3.zoomCropPreview);
    try {
        CameraController.iCaptureID = com.almalence.opencam.cameracontroller.HALv3.getInstance().mCaptureSession.setRepeatingRequest(com.almalence.opencam.cameracontroller.HALv3.previewRequestBuilder.build(), com.almalence.opencam.cameracontroller.HALv3.captureCallback, null);
    } catch (android.hardware.camera2.CameraAccessException e) {
        e.printStackTrace();
    }
}