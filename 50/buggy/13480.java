public static int getDisplayOrientation() {
    if (!(com.almalence.opencam.cameracontroller.CameraController.isHALv3))
        return com.almalence.opencam.cameracontroller.CameraController.mDisplayOrientation;
    else
        return 0;
    
}