protected void updateSeries(org.jfree.data.time.TimeSeries series, java.util.List<org.jfree.data.time.TimeSeriesDataItem> buffer) {
    series.setNotify(false);
    synchronized(buffer) {
        for (org.jfree.data.time.TimeSeriesDataItem dataItem : buffer) {
            series.add(dataItem);
        }
        buffer.clear();
    }
    series.fireSeriesChanged();
    series.setNotify(true);
}