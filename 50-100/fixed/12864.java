public org.json.JSONArray getStoryData() {
    org.json.JSONArray storyArray = new org.json.JSONArray();
    try {
        org.json.JSONArray mJSONArray = loadDataFromAsset();
        for (int i = 2; i < (mJSONArray.length()); i++) {
            storyArray.put(mJSONArray.getJSONObject(i));
        }
    } catch (org.json.JSONException ex) {
        ex.printStackTrace();
        return null;
    }
    return storyArray;
}