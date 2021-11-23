@java.lang.Override
public void drawMe(android.graphics.Canvas canvas) {
    paint.setStyle(Paint.Style.FILL);
    canvas.drawText(text, startX, startY, paint);
    paint.setStyle(Paint.Style.STROKE);
}