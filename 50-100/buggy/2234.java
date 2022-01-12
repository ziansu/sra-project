public void addData(android.view.View view) {
    com.github.mikephil.charting.charts.LineChart chart = ((com.github.mikephil.charting.charts.LineChart) (findViewById(R.id.chart)));
    chart.setUnit("dB Level");
    chart.setDrawYValues(false);
    chart.setDescription(" ");
    for (int i = 0; i < 15; i++) {
        this.addEntry(chart.getData(), i);
    }
    chart.animateXY(20, 20);
    chart.refreshDrawableState();
}