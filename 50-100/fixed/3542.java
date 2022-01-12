private void setPaintOptions() {
    tiBitmapPaint = new android.graphics.Paint();
    tiBitmapPaint.setAntiAlias(true);
    tiBitmapPaint.setDither(true);
    tiBitmapPaint.setColor(Color.BLACK);
    tiBitmapPaint.setStyle(Paint.Style.STROKE);
    tiBitmapPaint.setStrokeJoin(Paint.Join.ROUND);
    tiBitmapPaint.setStrokeCap(Paint.Cap.ROUND);
    tiBitmapPaint.setStrokeWidth(2);
    tiBitmapPaint.setAlpha(128);
}