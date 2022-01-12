public void putSeriesOfIndex(int idx) {
    index = idx;
    if (!(chartDisplay[index])) {
        for (int i = 0; i < (a[index].length); i++) {
            graph.addSeries(a[index][i]);
        }
        chartDisplay[index] = true;
    }
}