public void reload() {
    mAllData.clear();
    mDisplayedData.clear();
    notifyDataSetChanged();
    java.lang.Object data = com.bbtfr.merusuto.DataManager.loadLocalJSON(getActivity(), getTemplateString());
    if (data != null) {
        addAllJSONData(((com.alibaba.fastjson.JSONArray) (data)));
        search();
    }else {
        updateJSONData(false);
    }
}