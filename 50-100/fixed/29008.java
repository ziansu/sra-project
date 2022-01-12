public void updateTime(final java.util.Date newTime) {
    final java.util.Date oldTime = _currentTime;
    _currentTime = newTime;
    if (((newTime != null) && (!(newTime.equals(oldTime)))) || (newTime != oldTime)) {
        final org.jfree.chart.JFreeChart combined = _chartComposite.getChart();
        final info.limpet.stackedcharts.ui.view.TimeBarPlot plot = ((info.limpet.stackedcharts.ui.view.TimeBarPlot) (combined.getPlot()));
        plot.setTime(newTime);
        refreshPlot();
    }
}