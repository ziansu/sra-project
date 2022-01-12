public synchronized void fail(java.lang.Throwable error) {
    int errWidth = ((pixelWidth) == 0) ? 50 : pixelWidth;
    int errHeight = ((pixelHeight) == 0) ? 50 : pixelHeight;
    setBitmap(createErrorBitmap(errWidth, errHeight));
    ((react.RPromise<playn.core.Image>) (state)).fail(error);
}