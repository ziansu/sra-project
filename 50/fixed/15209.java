public void start() {
    mCameraService.addObserver(this);
    if ((mOrientationProvider) != null)
        mOrientationProvider.start();
    
}