@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    int x = (canvas.getWidth()) / 2;
    int y = ((int) ((canvas.getHeight()) - (paint.ascent()))) / 2;
    java.lang.String readout = java.lang.String.format("%3.2f%%", signalStrengthPercentage);
    canvas.drawText(readout, x, y, paint);
}