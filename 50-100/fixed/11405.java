public synchronized void fail(java.lang.Throwable error) {
    if ((pixelWidth) == 0)
        pixelWidth = 50;
    
    if ((pixelHeight) == 0)
        pixelHeight = 50;
    
    setBitmap(createErrorBitmap(pixelWidth, pixelHeight));
    ((react.RPromise<playn.core.Image>) (state)).fail(error);
}