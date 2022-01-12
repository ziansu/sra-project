public void getgroupmembers(int group_id, com.expensetracker.Interfaces.AsyncResponse asyncResponse) {
    java.lang.String stringurl = com.expensetracker.Constants.GET_GROUP_MEMBERS;
    java.net.URL url = null;
    org.json.JSONObject jsonObject = null;
    try {
        url = new java.net.URL(stringurl);
        jsonObject = new org.json.JSONObject();
        jsonObject.put("group_id", group_id);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    com.expensetracker.Model.AsyncData asyncTaskdata = new com.expensetracker.Model.AsyncData(url, jsonObject);
    com.expensetracker.NetworkUtils networkUtils = new com.expensetracker.NetworkUtils(context, asyncResponse, asyncTaskdata);
    networkUtils.forceLoad();
}