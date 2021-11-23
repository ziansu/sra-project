public boolean init(android.content.Context context, android.graphics.Bitmap src, android.graphics.Rect[] faces) {
    boolean result = false;
    if (nativeInit(src, faces.length, faces)) {
        result = nativeGetPreviewSize(mPreviewSize);
    }
    if (result) {
        mSketchBm = android.graphics.BitmapFactory.decodeResource(context.getResources(), R.raw.sketch_bm);
    }else {
        mSketchBm = null;
    }
    setFacesDetected(result);
    return result;
}