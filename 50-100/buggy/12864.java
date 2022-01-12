public org.json.JSONArray getStoryData() {
    org.json.JSONArray storyArray = null;
    try {
        org.json.JSONArray mJSONArray = loadDataFromAsset();
        for (int i = 2; i < (mJSONArray.length()); i++) {
            storyArray.put(mJSONArray.getJSONObject(i));
        }
    } catch (org.json.JSONException ex) {
        ex.printStackTrace();
    } finally {
        return storyArray;
    }
}