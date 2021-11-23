private void buyNow() throws org.json.JSONException {
    org.json.JSONObject jsonObject = new org.json.JSONObject();
    jsonObject.put("sessionId", db.getUserDetails().get("sessionId"));
    jsonObject.put("storeItemId", storeId);
    apiCall.apiRequestPost(getActivity(), jsonObject, Config.URL_STORE_BUY, "storeItemBuy", apiCallback);
    progressBarView(true);
}