@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    int newPos = rangeSpinnerModel.getNumber().intValue();
    view.component.plot.PlotView plot = transformRange.getPlot();
    int offset = ((int) ((transformRange.getStartPosition()) - (plot.getPlotLowerBound())));
    plot.setXTo((newPos - offset));
}