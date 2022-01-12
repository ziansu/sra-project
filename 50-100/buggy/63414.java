public synchronized void updateSeries(@android.support.annotation.NonNull
final android.content.Context context, @android.support.annotation.NonNull
final java.util.List<com.androidplot.xy.SimpleXYSeries> series, @android.support.annotation.NonNull
final com.sensirion.smartgadget.view.history.type.HistoryIntervalType interval, @android.support.annotation.NonNull
final com.sensirion.smartgadget.view.history.type.HistoryUnitType type) {
    mShouldResetRangeBoundaries = true;
    mDeviceSeries = series;
    cleanSeries();
    updatePlotRangeFormat(context, type);
    updatePlotDomainFormat(context, interval);
    updatePlot(context);
    android.util.Log.i(com.sensirion.smartgadget.view.history.PlotHandler.TAG, "updateSeries -> Series where updated, graph was updated.");
}