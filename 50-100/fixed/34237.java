@java.lang.Override
public void valueAxisChanged(final int index, final double lower, final double upper) {
    final org.csstudio.trends.databrowser2.model.AxisConfig axis = model.getAxis(index);
    if (axis != null) {
        display.asyncExec(() -> axis.setRange(lower, upper));
    }
}