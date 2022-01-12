private void drawTxt(android.graphics.Canvas canvas, float x, float y) {
    canvas.drawText(txt, x, (((((fm.bottom) - (fm.top)) / 2) - (fm.bottom)) + y), txtPaint);
}