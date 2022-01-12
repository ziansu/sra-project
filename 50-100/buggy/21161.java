private void loadDatasRestore() {
    if ((framgia.vn.framgiacrb.activity.MainActivity.sCurrentDate) != null) {
        try {
            initDatas();
            int left = 0;
            int right = mDatas.size();
            restoreData(left, right);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        setRefreshing(false);
        return ;
    }
}