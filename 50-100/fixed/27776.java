public void removeSeriesOfIndex(int idx) {
    index = idx;
    if ((chartDisplay[index]) && ((a[index]) != null)) {
        for (int i = 0; i < (a[index].length); i++) {
            graph.removeSeries(a[index][i]);
        }
        chartDisplay[index] = false;
    }
}