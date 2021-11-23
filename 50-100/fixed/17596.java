private void getNewLineChart(java.lang.String range, java.lang.String algorithm, double threshold) {
    previousEdge = 0;
    this.range = range;
    this.threshold = threshold;
    this.algo = algorithm;
    lineChart = graphUtils.getLineChart(range, algo, threshold);
    setSymbolSizeofLineGraph();
    setLineThicknessofLineGraph();
    SetDisplayDetailToNode();
    RemoveEdgeDetailLabel();
}