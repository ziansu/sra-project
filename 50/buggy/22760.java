private void stopUpdateStartIfNecessary() {
    if ((mAttacher) != null) {
        boolean wasPanning = mAttacher.isPanning();
        mAttacher.stopPanning();
        mAttacher.update();
        if (wasPanning)
            mAttacher.startPanning();
        
    }
}