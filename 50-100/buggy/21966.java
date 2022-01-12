private void getDataFromHttp() {
    try {
        org.json.JSONObject jsonObject = com.example.root.libapp_v1.HttpModule.DoGetAndPost.doGet(mGetUrl);
        org.json.JSONArray userInfo = jsonObject.getJSONArray("userInfo");
        org.json.JSONObject userOne = userInfo.getJSONObject(0);
        mPersonpageName.setText(((java.lang.String) (userOne.get("username"))));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}