@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    if ((dataList) != null) {
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            com.lxh.rotateview.RotateView.BitmapPoint track = dataList.get(i);
            track.handleStatus();
            mPaint.setAlpha(track.getAlpha());
            canvas.drawBitmap(track.getmBitmap(), track.getMatrix(), mPaint);
        }
    }
}