private void drawLayoutOutline(android.graphics.Canvas canvas) {
    canvas.drawRect(getPaddingLeft(), (1 + (getPaddingTop())), ((((getWidth()) - (getPaddingLeft())) - (getPaddingRight())) - 1), ((((getHeight()) - (getPaddingTop())) - (getPaddingBottom())) - 1), outlinePaint);
}