protected void updateSeries(org.jfree.data.time.TimeSeries series, java.util.List<org.jfree.data.time.TimeSeriesDataItem> buffer) {
    series.setNotify(false);
    synchronized(buffer1) {
        for (org.jfree.data.time.TimeSeriesDataItem dataItem : buffer1) {
            series.add(dataItem);
        }
        buffer1.clear();
    }
    series.fireSeriesChanged();
    series.setNotify(true);
}