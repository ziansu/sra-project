public void handleMessage(java.lang.String message) {
    if (com.snobot.vision_app.app2017.VisionRobotConnection.sHEARTBEAT_MESSAGE.equals(message)) {
        mLastHeartbeatReceiveTime = java.lang.System.currentTimeMillis();
    }else
        if (com.snobot.vision_app.app2017.VisionRobotConnection.sUSE_FRONT_CAMERA.equals(message)) {
            mCameraActivity.useCamera(CameraBridgeViewBase.CAMERA_ID_FRONT);
        }else
            if (com.snobot.vision_app.app2017.VisionRobotConnection.sUSE_BACK_CAMERA.equals(message)) {
                mCameraActivity.useCamera(CameraBridgeViewBase.CAMERA_ID_BACK);
            }else {
                android.util.Log.e(com.snobot.vision_app.app2017.VisionRobotConnection.sTAG, ("Parsing unknown messages: " + message));
            }
        
    
}