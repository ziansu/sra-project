@java.lang.Override
public void onStateChanged(com.parrot.arsdk.arcontroller.ARDeviceController deviceController, com.parrot.arsdk.arcontroller.ARCONTROLLER_DEVICE_STATE_ENUM newState, com.parrot.arsdk.arcontroller.ARCONTROLLER_ERROR_ENUM error) {
    mState = newState;
    if (ARCONTROLLER_DEVICE_STATE_ENUM.ARCONTROLLER_DEVICE_STATE_RUNNING.equals(mState)) {
        mDeviceController.getFeatureARDrone3().sendMediaStreamingVideoEnable(((byte) (1)));
    }
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            notifyConnectionChanged(mState);
        }
    });
}