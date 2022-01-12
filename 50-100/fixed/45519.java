public java.util.List<vo.logisticsvo.LogisticsInfo> getInfoForTableView() {
    java.util.List<vo.logisticsvo.LogisticsInfo> ans = new java.util.ArrayList<vo.logisticsvo.LogisticsInfo>(time.size());
    for (int i = 0; i < (time.size()); i++) {
        ans.add(vo.logisticsvo.LogisticsInfo.build(time.get(i), location.get(i)));
    }
    return ans;
}