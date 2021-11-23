public void setFlash(boolean flag) {
    if ((mCamera) != null) {
        mFlashState = flag;
        toggleTorch(flag);
    }
}