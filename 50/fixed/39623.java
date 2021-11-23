@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    drawChartBg(canvas);
    drawXAxis(canvas);
    drawXAxisLabel(canvas);
    drawYAxis(canvas);
    drawLine(canvas);
    drawYAxisLabel(canvas);
    drawBaseLine(canvas);
}