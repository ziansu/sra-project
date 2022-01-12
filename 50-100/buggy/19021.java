private void displaySavedData(java.util.List<java.lang.String> savedList) {
    int i;
    for (i = 0; i < (savedList.size()); i++) {
        series0.appendData(new com.jjoe64.graphview.series.DataPoint(i, java.lang.Integer.parseInt(savedList.get(i))), false, 100);
    }
    current_x_axis = i;
    autoZoom(graph, savedList, i);
}