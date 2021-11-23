@java.lang.Override
public void fillRect(int x, int y, int w, int h) {
    currentPaint.setStyle(Paint.Style.FILL);
    back.drawRect(x, y, (x + w), (y + h), currentPaint);
}