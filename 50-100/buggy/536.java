@java.lang.Override
public boolean handleChange(java.lang.Object oldValue, java.lang.Object newValue, org.eclipse.draw2d.IFigure refreshableFigure) {
    if ((traceDataProvider[index]) == null) {
        traceDataProvider[index].setCurrentXDataArray(((double[]) (newValue)));
        xTraceDataSize[index] = ((double[]) (newValue)).length;
    }
    return true;
}