private void initChart() {
    mPoints = new java.util.ArrayList<lecho.lib.hellocharts.model.PointValue>();
    mLines = new java.util.ArrayList<lecho.lib.hellocharts.model.Line>();
    mLine = new lecho.lib.hellocharts.model.Line(mPoints).setColor(Color.WHITE).setCubic(true);
    mLine.setPointRadius(1);
    mLine.setStrokeWidth(1);
    mLine.setCubic(false);
    mLines.add(mLine);
    mChartData = new lecho.lib.hellocharts.model.LineChartData();
    mChartData.setBaseValue(java.lang.Float.NEGATIVE_INFINITY);
    mChartView.setLineChartData(mChartData);
}