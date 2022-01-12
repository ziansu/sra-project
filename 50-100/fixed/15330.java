public void updateShowStats() {
    java.util.List<java.lang.String> series = getSeries(2, false, null);
    for (int i = 0; i < (series.size()); i += 1) {
        updateShowStats(series.get(i));
    }
}