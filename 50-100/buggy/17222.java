@java.lang.Override
public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
    android.util.Log.e("glucosio", ((("Values is " + value) + "; Size is: ") + (xValues.size())));
    if ((value < (xValues.size())) && (value > 0)) {
        return xValues.get(((int) (value)));
    }else {
        return "";
    }
}