public void onDraw(android.graphics.Canvas canvas) {
    canvasLogger.log(canvas, canvasRect, viewRect, scaleFactor);
    canvas.drawRect(canvasRect, paint);
    canvas.scale(scaleFactor, scaleFactor);
    canvas.translate((-(viewRect.left)), (-(viewRect.top)));
}