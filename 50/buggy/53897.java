static void getAlgTrackerGraph() {
    int[] algTrackerResults = AlgTracker.getArray();
    BarChartMaker.makeAlgTrackerChart(algTrackerResults);
    XYChartMaker.makeAlgTrackerChart(algTrackerResults);
}