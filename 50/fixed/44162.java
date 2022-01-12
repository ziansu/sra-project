public void stop() {
    mCameraService.deleteObserver(this);
    if ((mOrientationProvider) != null)
        mOrientationProvider.stop();
    
}