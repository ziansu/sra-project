@java.lang.Override
public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
    java.lang.String res = visionWords.get(((int) (value)));
    try {
        return (res.substring(0, 5)) + ".";
    } catch (java.lang.Exception e) {
        return res;
    }
}