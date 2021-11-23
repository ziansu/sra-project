public void addData(android.view.View view) {
    for (int i = 0; i < 15; i++) {
        this.addEntry(chart.getData(), i);
    }
    chart.animateXY(20, 20);
    chart.refreshDrawableState();
}