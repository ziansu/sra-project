private lecho.lib.hellocharts.model.LineChartData generateLineData(java.util.List<com.bwisni.pub1521.DatePoint> dpList) {
    lecho.lib.hellocharts.model.Line line = new lecho.lib.hellocharts.model.Line(getGraphData(dpList));
    line.setColor(Color.WHITE);
    line.setCubic(true);
    line.setHasLabels(false);
    line.setHasLines(true);
    line.setHasPoints(true);
    java.util.List<lecho.lib.hellocharts.model.Line> lines = new java.util.ArrayList<>();
    lines.add(line);
    return new lecho.lib.hellocharts.model.LineChartData(lines);
}