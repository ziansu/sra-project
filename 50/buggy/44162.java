public void stop() {
    mCameraService.deleteObserver(this);
    mOrientationProvider.stop();
}