public void updateCallbackBufferAndSwap(java.nio.FloatBuffer callbackBuffer, int pointCount, double timestamp, com.google.atap.tangoservice.TangoPoseData pointCloudPose) {
    newTimestamp = timestamp;
    this.pointCloudPose = pointCloudPose;
    mSharedPointCloudData.floatBuffer.position(0);
    mCallbackPointCloudData.floatBuffer.position(0);
    mCallbackPointCloudData.floatBuffer.put(callbackBuffer);
    synchronized(mPointCloudLock) {
        java.nio.FloatBuffer temp = mSharedPointCloudData.floatBuffer;
        mSharedPointCloudData.floatBuffer = mCallbackPointCloudData.floatBuffer;
        mSharedPointCloudData.pointCount = mCallbackPointCloudData.pointCount;
        mCallbackPointCloudData.floatBuffer = temp;
        mCallbackPointCloudData.pointCount = pointCount;
        mSwapSignal = true;
    }
}