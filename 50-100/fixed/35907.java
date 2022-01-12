private void setupContent() {
    se = new com.myApp.vilrolf.discgolfputting.Engine.StatisticsEngine(activeThrows);
    tableLayout1.removeAllViews();
    tableLayout2.removeAllViews();
    lineChartView.invalidate();
    lineChartView.reset();
    if ((activeThrows.size()) != 0) {
        setupStaticTableData(tableLayout1);
        setupDynamicTableData(tableLayout2);
        setupLineChart();
    }
}