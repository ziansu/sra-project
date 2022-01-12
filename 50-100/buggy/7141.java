public void onClick(android.view.View view) {
    java.lang.String newYaxis = ((java.lang.String) (yAxisSpinner.getSelectedItem()));
    histogram.removeAllSeries();
    if (newYaxis == "Virus") {
    }else {
    }
    java.lang.String titleToShow = ((reportYear + " ") + newYaxis) + " Histogram";
    histogramTitle.setText(titleToShow);
}