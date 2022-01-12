private void resetGraph() {
    queue.flush();
    mGraph.removeAllSeries();
    mGraph.getViewport().setScalable(true);
    mGraph.getViewport().setXAxisBoundsManual(true);
    mGraph.getViewport().setYAxisBoundsManual(true);
    maxDataX = 0;
    minDataX = 0;
    maxDataY = 0;
    minDataY = 0;
    setAxesMinMax(com.chairtrax.app.WheelTrackingFragment.initialXAxis, com.chairtrax.app.WheelTrackingFragment.initialYAxis);
}