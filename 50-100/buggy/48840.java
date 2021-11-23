private static boolean getFocusModeSupported() {
    int[] supported_focus = com.almalence.opencam.cameracontroller.CameraController.getSupportedFocusModesInternal();
    return ((supported_focus != null) && ((supported_focus.length) > 0)) && ((supported_focus[0]) != (com.almalence.opencam.CameraParameters.AF_MODE_OFF));
}