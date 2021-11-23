@java.lang.Override
public boolean handleChange(java.lang.Object oldValue, java.lang.Object newValue, org.eclipse.draw2d.IFigure refreshableFigure) {
    if ((traceDataProvider[index]) != null) {
        trace[index].setTraceColor(getModelColor(((org.csstudio.sds.component.xygraph.model.XyGraphModel.PROP_PRIMARY_AXIS_TRACE_COLOR_PREFIX) + index)));
    }
    return true;
}