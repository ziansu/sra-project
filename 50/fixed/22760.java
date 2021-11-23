private void stopUpdateStartIfNecessary() {
    if ((mAttacher) != null) {
        boolean wasPanning = mAttacher.isPanning();
        mAttacher.stopPanning();
        if (wasPanning)
            mAttacher.startPanning();
        
    }
}