public void reloadData(java.util.List<com.interview.darrengu.sampleapp1.models.Store_> list) {
    storeList.clear();
    storeList.addAll(list);
    notifyDataSetChanged();
}