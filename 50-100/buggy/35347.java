@java.lang.Override
public void onValueSelected(com.github.mikephil.charting.data.Entry e, int dataSetIndex, com.github.mikephil.charting.highlight.Highlight h) {
    com.github.mikephil.charting.data.BarEntry entry = ((com.github.mikephil.charting.data.BarEntry) (e));
    if (entry.isStacked())
        android.util.Log.i("VAL SELECTED", ("Value: " + (entry.getVals()[h.getStackIndex()])));
    else
        android.util.Log.i("VAL SELECTED", ("Value: " + (entry.getVal())));
    
}