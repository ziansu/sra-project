public void clear() {
    dataList.clear();
    stringDataList.clear();
    filteredData.clear();
    com.adsamcik.signalcollector.adapters.FilterableAdapter.notifyDataSetChanged();
}