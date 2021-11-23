public void clear() {
    notifyItemRangeRemoved(0, dataSetVisibleCount);
    dataSetVisibleCount = 0;
    dataSet.clear();
    dataMap.clear();
    notifyDataSetChanged();
}