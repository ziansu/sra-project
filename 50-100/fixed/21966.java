private org.json.JSONObject getDataFromHttp() {
    try {
        org.json.JSONObject jsonObject = com.example.root.libapp_v1.HttpModule.DoGetAndPost.doGet(mGetUrl);
        org.json.JSONArray userInfo = jsonObject.getJSONArray("userInfo");
        org.json.JSONObject userOne = userInfo.getJSONObject(0);
        return userOne;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}