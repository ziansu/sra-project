@java.lang.Override
public void run() {
    removeSeries(finSeries);
    finSeries.setEnabled(false);
    refresh();
}