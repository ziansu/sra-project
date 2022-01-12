@java.lang.Override
public void controlResized(org.eclipse.swt.events.ControlEvent e) {
    int width = java.lang.Math.max(((compositeChart.getSize().x) - 40), 1);
    numberOfTicks = java.lang.Math.max((width / (fr.inria.soctrace.framesoc.ui.histogram.view.HistogramView.TIMESTAMP_MAX_SIZE)), 1);
    refresh(false, false);
}