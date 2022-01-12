@java.lang.Override
public void valueAxisChanged(final int index, final double lower, final double upper) {
    if (index < (model.getAxisCount())) {
        final org.csstudio.trends.databrowser2.model.AxisConfig axis = model.getAxis(index);
        display.asyncExec(() -> axis.setRange(lower, upper));
    }
}