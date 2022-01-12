public java.util.List<java.lang.Integer> getErrorCategoryIDList() {
    java.util.List<java.lang.Integer> idList = new java.util.ArrayList<>();
    com.alibaba.fastjson.JSONObject quotaObject = getDataObject().getJSONObject("quota");
    for (java.lang.String key : quotaObject.keySet()) {
        int value = quotaObject.getInteger(key);
        if (value < 0) {
            idList.add(java.lang.Integer.valueOf(key));
        }
    }
    return idList;
}