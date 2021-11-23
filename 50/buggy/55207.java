public org.ozram1922.image.PixyCamFrame GetFrame(org.ozram1922.image.PixyCamFrame oldFrame) {
    if (null != oldFrame) {
        synchronized(this) {
            if (oldFrame.IsDifferent(_frameId))
                return oldFrame;
            
        }
    }
    return CopyOfFrame();
}