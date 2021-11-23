public void setCameraDebugMessageLogging(int level) {
    this.debugLevel = level;
    if ((mPreview) != null) {
        mPreview.debugLevel = level;
    }
}