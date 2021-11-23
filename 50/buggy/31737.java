@java.lang.Override
public boolean handleChange(java.lang.Object oldValue, java.lang.Object newValue, org.eclipse.draw2d.IFigure refreshableFigure) {
    if ((traceDataProvider[index]) == null) {
        trace[index].setLineWidth(((int) (newValue)));
    }
    return true;
}