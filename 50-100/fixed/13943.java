public void onDraw(android.graphics.Canvas canvas) {
    canvasLogger.log(canvas, canvasRect, viewRect, scaleFactor);
    canvas.drawRect(canvasRect, paint);
    canvas.translate((-(viewRect.left)), (-(viewRect.top)));
    canvas.scale(scaleFactor, scaleFactor);
}