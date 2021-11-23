@java.lang.Override
public void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities cameraCapabilities) {
    mHandler.obtainMessage(android.telecom.VideoCallImpl.MessageHandler.MSG_CHANGE_CAMERA_CAPABILITIES, cameraCapabilities).sendToTarget();
}