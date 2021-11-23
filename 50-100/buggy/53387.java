public void addDataSource(msi.gama.outputs.layers.charts.ChartDataSource source) {
    sources.add(source);
    java.util.LinkedHashMap<java.lang.String, msi.gama.outputs.layers.charts.ChartDataSeries> newseries = source.getSeries();
    for (java.util.Map.Entry<java.lang.String, msi.gama.outputs.layers.charts.ChartDataSeries> entry : newseries.entrySet()) {
        addNewSerie(entry.getKey(), entry.getValue(), 0);
    }
}