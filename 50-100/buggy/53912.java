private void drawLayoutOutline(android.graphics.Canvas canvas) {
    canvas.drawRect(getPaddingLeft(), (1 + (getPaddingTop())), (((getWidth()) - (getPaddingLeft())) - (getPaddingRight())), (((getHeight()) - (getPaddingTop())) - (getPaddingBottom())), outlinePaint);
}