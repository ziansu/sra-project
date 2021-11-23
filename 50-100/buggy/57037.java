@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    de.jClipCorn.gui.frames.statisticsFrame.charts.StatisticsChart chart = cbxChooseChart.getItemAt(cbxChooseChart.getSelectedIndex());
    if (chart != null)
        pnlCheckSeries.setVisible(chart.usesFilterableSeries());
    
    if (chart != null)
        pnlYearRange.setVisible(chart.usesFilterableYearRange());
    
    assignChart(chart);
    if (chart != null)
        chart.onHideSeries(seriesList.getMap());
    
    if (chart != null)
        chart.onFilterYearRange(selectedYear);
    
}