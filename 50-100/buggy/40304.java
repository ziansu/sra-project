public boolean init(android.content.Context context, android.graphics.Bitmap src, android.graphics.Rect[] faces) {
    setFacesDetected(true);
    if (nativeInit(src, faces.length, faces)) {
        nativeGetPreviewSize(mPreviewSize);
        mSketchBm = android.graphics.BitmapFactory.decodeResource(context.getResources(), R.raw.sketch_bm);
        return true;
    }else {
        mSketchBm = null;
        return false;
    }
}