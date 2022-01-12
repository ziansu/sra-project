private void drawTxt(android.graphics.Canvas canvas, android.graphics.RectF rectF) {
    canvas.drawText(txt, rectF.centerX(), (((((fm.bottom) - (fm.top)) / 2) - (fm.bottom)) + (rectF.centerY())), txtPaint);
}