@java.lang.Override
public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
    if ((value < (xValues.size())) && (value > 0)) {
        return xValues.get(((int) (value)));
    }else {
        return "";
    }
}