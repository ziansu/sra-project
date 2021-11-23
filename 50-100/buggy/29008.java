public void updateTime(final java.util.Date newTime) {
    java.util.Date oldTime = _currentTime;
    _currentTime = newTime;
    if (((newTime != null) && (!(newTime.equals(oldTime)))) || (newTime != oldTime)) {
        org.jfree.chart.JFreeChart combined = _chartComposite.getChart();
        info.limpet.stackedcharts.ui.view.TimeBarPlot plot = ((info.limpet.stackedcharts.ui.view.TimeBarPlot) (combined.getPlot()));
        plot.setTime(newTime);
        refreshPlot();
    }
}