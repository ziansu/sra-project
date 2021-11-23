public void draw(android.graphics.Canvas canvas) {
    com.idonans.acommon.lang.CommonLog.d(((com.idonans.doodle.DoodleView.Render.CanvasBuffer.TAG) + " draw"));
    refreshBuffer();
    canvas.drawBitmap(mBitmap, 0.0F, 0.0F, null);
}