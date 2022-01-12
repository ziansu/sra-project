public void setData(com.github.mikephil.charting.data.LineData data) {
    mLineData = data;
    mDataSets.addAll(data.getDataSets());
    init(data.getDataSets());
}