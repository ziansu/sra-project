public CascadeDialog.FragmentState getCascadeData(int level, java.util.List<java.lang.Integer> select, int selectPos) {
    java.util.List<com.qiyu.wbg.cascadeview.CascadeData> dataList = getChildren(0, level, select, this);
    java.lang.String title = dataList.get(selectPos).name;
    return new com.qiyu.wbg.cascadeview.CascadeDialog.FragmentState(dataList, selectPos, level, title);
}