public boolean setColorsInverted(boolean invert) {
    synchronized(mCameraLock) {
        if (((mCamera) != null) && ((mode) != null)) {
            android.hardware.Camera.Parameters parameters = mCamera.getParameters();
            if (invert) {
                parameters.setColorEffect(Camera.Parameters.EFFECT_NEGATIVE);
            }else {
                parameters.setColorEffect(Camera.Parameters.EFFECT_NONE);
            }
            mCamera.setParameters(parameters);
        }
        return false;
    }
}