@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    if ((nativeCanvasBitmap) != null) {
        java.lang.System.out.println(("nativeCanvas being drawn " + (nativeCanvasBitmap)));
        canvas.drawBitmap(nativeCanvasBitmap, 0, 0, mPaint);
    }
}