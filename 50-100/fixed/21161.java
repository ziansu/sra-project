private void loadDatasRestore() {
    try {
        initDatas();
        int left = 0;
        int right = mDatas.size();
        restoreData(left, right);
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    setRefreshing(false);
}