public void addDataList(java.util.List<com.mredrock.cyxbs.model.lost.Lost> dataList) {
    mList.addAll(dataList);
    notifyItemRangeInserted(mList.size(), dataList.size());
}