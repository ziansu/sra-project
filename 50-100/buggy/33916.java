public void onPreviewFrame(byte[] frame, android.hardware.Camera arg1) {
    android.util.Log.d(org.opencv.android.JavaCameraView.TAG, ("Preview Frame received. Frame size: " + (frame.length)));
    synchronized(this) {
        mFrameChain[(1 - (mChainIdx))].put(0, 0, frame);
        this.notify();
    }
    if ((mCamera) != null)
        mCamera.addCallbackBuffer(mBuffer);
    
}