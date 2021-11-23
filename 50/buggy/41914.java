public void replaceDataList(java.util.List<com.mredrock.cyxbs.model.lost.Lost> dataList) {
    mList.clear();
    mList.addAll(dataList);
    notifyDataSetChanged();
}