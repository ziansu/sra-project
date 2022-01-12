private static void createSeries(org.jfree.data.xy.XYSeriesCollection seriesCollection, org.nd4j.linalg.api.ndarray.INDArray data, int offset, java.lang.String name) {
    int nRows = data.shape()[2];
    org.jfree.data.xy.XYSeries series = new org.jfree.data.xy.XYSeries(name);
    for (int i = 0; i < nRows; i++) {
        series.add((i + offset), data.getDouble(i));
    }
    seriesCollection.addSeries(series);
}