public void clear() {
    dataSet.clear();
    dataMap.clear();
    notifyItemRangeRemoved(0, dataSetVisibleCount);
    dataSetVisibleCount = 0;
}