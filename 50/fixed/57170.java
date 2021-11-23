@java.lang.Override
public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
    int index = ((int) (value)) - 1;
    if (index <= 0) {
        index = 0;
    }
    return mDateArray[index];
}