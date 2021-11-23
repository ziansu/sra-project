private void drawChildCell(android.graphics.Canvas canvas, int[] rect) {
    canvas.drawRect(rect[0], rect[1], ((rect[2]) + (rect[0])), ((rect[3]) + (rect[1])), cellPaint);
}