public org.json.JSONArray getUserData() {
    org.json.JSONArray userArray = new org.json.JSONArray();
    try {
        org.json.JSONArray mJSONArray = loadDataFromAsset();
        for (int i = 0; i < 2; i++) {
            userArray.put(mJSONArray.getJSONObject(i));
        }
    } catch (org.json.JSONException ex) {
        ex.printStackTrace();
        return null;
    }
    return userArray;
}