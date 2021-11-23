@java.lang.Override
public boolean handleChange(java.lang.Object oldValue, java.lang.Object newValue, org.eclipse.draw2d.IFigure refreshableFigure) {
    if ((traceDataProvider[index]) == null) {
        trace[index].setPointStyle(org.eclipse.nebula.visualization.xygraph.figures.Trace.PointStyle.values()[((int) (newValue))]);
    }
    return true;
}