void updateChart(int position) {
    android.view.View view = getViewAtPosition(position);
    updateChart(((com.github.mikephil.charting.charts.LineChart) (view.findViewById(R.id.chart))));
}