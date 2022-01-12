@java.lang.Override
public void run() {
    if (((_chartComposite) != null) && (!(_chartComposite.isDisposed()))) {
        org.jfree.chart.JFreeChart c = _chartComposite.getChart();
        if (c != null) {
            c.setNotify(true);
        }
    }
}