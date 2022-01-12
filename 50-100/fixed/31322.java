private void drawTxt(android.graphics.Canvas canvas, int x, int y) {
    canvas.drawText(txt, x, (((((fm.bottom) - (fm.top)) / 2) - (fm.bottom)) + y), txtPaint);
}