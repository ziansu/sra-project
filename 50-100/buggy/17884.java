@com.google.appinventor.components.annotations.SimpleFunction(description = "Add an entry to the chart")
public void AddEntry(float value, java.lang.String label) {
    com.github.mikephil.charting.interfaces.datasets.IPieDataSet iPieDataSet = pieChart.getData().getDataSet();
    com.github.mikephil.charting.data.PieEntry pieEntry = new com.github.mikephil.charting.data.PieEntry(value, label);
    entries.add(pieEntry);
    iPieDataSet.addEntry(pieEntry);
    pieChart.getData().notifyDataChanged();
    pieChart.notifyDataSetChanged();
    pieChart.invalidate();
}