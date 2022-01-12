public org.knowm.xchart.BubbleSeries addSeries(java.lang.String seriesName, java.util.List<? extends java.lang.Number> xData, java.util.List<? extends java.lang.Number> yData, java.util.List<? extends java.lang.Number> bubbleData) {
    return addSeries(seriesName, org.knowm.xchart.internal.Utils.getDoubleArrayFromNumberList(xData), org.knowm.xchart.internal.Utils.getDoubleArrayFromNumberList(yData), org.knowm.xchart.internal.Utils.getDoubleArrayFromNumberList(bubbleData));
}