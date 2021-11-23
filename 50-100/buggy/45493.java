@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    android.graphics.Paint paint = new android.graphics.Paint();
    paint.setColor(Color.RED);
    paint.setTextSize(40);
    canvas.drawText("## Overlay ##", 250, 50, paint);
}