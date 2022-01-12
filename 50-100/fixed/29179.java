public void putSeriesOfIndex(int idx) {
    index = idx;
    if ((!(chartDisplay[index])) && ((a[index]) != null)) {
        for (int i = 0; i < (a[index].length); i++) {
            graph.addSeries(a[index][i]);
        }
        chartDisplay[index] = true;
    }
}