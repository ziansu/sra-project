@java.lang.Override
public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
    java.util.Date date = new java.util.Date(((long) (value)));
    return mFormat.format(date);
}