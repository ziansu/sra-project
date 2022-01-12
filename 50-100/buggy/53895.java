protected com.github.mikephil.charting.utils.Highlight getStackedHighlight(int xIndex, int dataSet, double yValue) {
    com.github.mikephil.charting.data.BarEntry entry = mData.getDataSetByIndex(dataSet).getEntryForXIndex(xIndex);
    int stackIndex = entry.getClosestIndexAbove(((float) (yValue)));
    com.github.mikephil.charting.utils.Highlight h = new com.github.mikephil.charting.utils.Highlight(xIndex, dataSet, stackIndex);
    return h;
}