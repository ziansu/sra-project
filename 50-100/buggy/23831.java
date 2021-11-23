private void setupChart() {
    pieChart.animateY(1400, Easing.EasingOption.EaseInOutQuad);
    pieChart.setDrawHoleEnabled(false);
    com.github.mikephil.charting.components.Legend legend = pieChart.getLegend();
    legend.setTextColor(getResources().getColor(R.color.primaryTextColor));
    com.github.mikephil.charting.components.Description description = new com.github.mikephil.charting.components.Description();
    description.setText("Market Capitlization for All Cryptocurrencies");
    description.setTextColor(getResources().getColor(R.color.primaryTextColor));
    pieChart.setDescription(description);
    pieChart.setEntryLabelColor(getResources().getColor(R.color.colorPrimary));
}