@java.lang.Override
public java.lang.String getFormattedValue(float value, com.github.mikephil.charting.components.AxisBase axis) {
    java.lang.String res = visionWords.get(((int) (value)));
    if ((res.length()) > 5)
        return (res.substring(1, 5)) + ".";
    else
        return res;
    
}