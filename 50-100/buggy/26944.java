@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    if (shouldRedraw) {
        for (milespeele.canvas.paint.PaintPath p : mPaths) {
            canvas.drawPath(p, p.getPaint());
        }
        shouldRedraw = false;
    }else {
        canvas.drawBitmap(mBitmap, 0, 0, null);
    }
}