private void setupContent() {
    se = new com.myApp.vilrolf.discgolfputting.Engine.StatisticsEngine(activeThrows);
    tableLayout1.removeAllViews();
    setupStaticTableData(tableLayout1);
    tableLayout2.removeAllViews();
    setupDynamicTableData(tableLayout2);
    lineChartView.invalidate();
    lineChartView.reset();
    setupLineChart();
}