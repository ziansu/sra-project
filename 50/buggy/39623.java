@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    drawChartBg(canvas);
    drawYAxis(canvas);
    drawYAxisLabel(canvas);
    drawXAxis(canvas);
    drawXAxisLabel(canvas);
    drawLine(canvas);
    drawBaseLine(canvas);
}