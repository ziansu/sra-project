@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    int newPos = rangeSpinnerModel.getNumber().intValue();
    if (newPos != (transformRange.getStartPosition())) {
        view.component.plot.PlotView plot = transformRange.getPlot();
        int offset = ((int) ((transformRange.getStartPosition()) - (plot.getPlotLowerBound())));
        plot.setXTo((newPos - offset));
    }
}