public void draw(android.graphics.Canvas canvas) {
    android.graphics.Paint paint = new android.graphics.Paint();
    paint.setColor(Color.BLUE);
    paint.setStyle(Paint.Style.FILL);
    canvas.drawCircle(((x) - (r)), ((y) + (r)), r, paint);
}