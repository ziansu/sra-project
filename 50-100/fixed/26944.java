@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    if (shouldRedraw) {
        for (milespeele.canvas.paint.PaintPath p : mPaths) {
            canvas.drawPath(p, p.getPaint());
        }
    }else {
        canvas.drawBitmap(mBitmap, 0, 0, null);
        shouldRedraw = false;
    }
}