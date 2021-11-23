public java.util.ArrayList<org.eclipse.ice.viz.plotviewer.SeriesProvider> getSeriesAtTime(double time) {
    if (seriesMap.containsKey(time)) {
        return seriesMap.get(time);
    }else {
        return null;
    }
}