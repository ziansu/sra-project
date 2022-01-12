public void setLog(java.lang.String log) {
    java.lang.String userNo = userPreferences.getUserNo();
    sendData = new org.json.JSONObject();
    try {
        sendData.put("userNo", userNo);
        sendData.put("log", log);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    requestNetwork = new com.learnfun.super8team.learnfun.NetworkAsync(this, "setLog", NetworkAsync.POST, sendData);
    requestNetwork.execute();
}