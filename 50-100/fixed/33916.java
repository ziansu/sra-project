public void onPreviewFrame(byte[] frame, android.hardware.Camera arg1) {
    synchronized(this) {
        mFrameChain[(1 - (mChainIdx))].put(0, 0, frame);
        this.notify();
    }
    if ((mCamera) != null)
        mCamera.addCallbackBuffer(mBuffer);
    
}