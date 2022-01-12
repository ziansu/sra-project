public void reset() {
    for (java.lang.String chartSeriesKey : new java.util.ArrayList(dataSeriesMap.keySet())) {
        dataSeriesMap.remove(chartSeriesKey);
        chart.removeSeries(chartSeriesMap.remove(chartSeriesKey));
    }
    yAxisMap.clear();
    if ((chart) != null) {
        chart.removeAllSeries();
    }
}