public static void resetExposureCompensationHALv3() {
    android.util.Log.e(com.almalence.opencam.cameracontroller.HALv3.TAG, "RESET EXPOSURE COMPENSATION");
    if (((com.almalence.opencam.cameracontroller.HALv3.previewRequestBuilder) != null) && ((com.almalence.opencam.cameracontroller.HALv3.getInstance().camDevice) != null)) {
        com.almalence.opencam.cameracontroller.HALv3.previewRequestBuilder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0);
        try {
            CameraController.iCaptureID = com.almalence.opencam.cameracontroller.HALv3.getInstance().mCaptureSession.setRepeatingRequest(com.almalence.opencam.cameracontroller.HALv3.previewRequestBuilder.build(), com.almalence.opencam.cameracontroller.HALv3.captureCallback, null);
        } catch (android.hardware.camera2.CameraAccessException e) {
            e.printStackTrace();
        }
    }
}