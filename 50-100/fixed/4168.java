@java.lang.Override
public boolean handleChange(java.lang.Object oldValue, java.lang.Object newValue, org.eclipse.draw2d.IFigure refreshableFigure) {
    if ((traceDataProvider[index]) != null) {
        int yDataLength = ((double[]) (newValue)).length;
        if (yDataLength != (xTraceDataSize[index])) {
            model.setPrimaryXAxisTraceData(index, generateXData(yDataLength, model.getPrimaryXAxisBinSize(index)));
        }
        traceDataProvider[index].setCurrentYDataArray(((double[]) (newValue)));
    }
    return true;
}