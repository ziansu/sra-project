@java.lang.Override
public void draw(android.graphics.Canvas onCanvas) {
    android.graphics.Paint border = new android.graphics.Paint();
    border.setColor(Color.BLACK);
    border.setStyle(Paint.Style.STROKE);
    border.setStrokeWidth(1);
    onCanvas.drawRect(getX(), getY(), ((getW()) - 1), ((getH()) - 1), border);
    super.draw(onCanvas);
}