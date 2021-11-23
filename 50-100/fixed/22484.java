@java.lang.Override
void setDeviceRotation(int deviceRotation) {
    this.mDeviceRotation = deviceRotation;
    if ((mCameraParameters) != null) {
        int rotation = ((calculateCameraRotation(mDisplayOrientation)) + ((mFacing) == (CameraKit.Constants.FACING_FRONT) ? 180 : 0)) % 360;
        mCameraParameters.setRotation(((rotation + (mDeviceRotation)) % 360));
    }
}