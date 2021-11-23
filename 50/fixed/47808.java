protected void attachToBaseObjectIfNeeded(int i, WT el, boolean insert) {
    if ((changeMonitor) != null)
        attachToBaseObject(i, el, insert, false);
    
}