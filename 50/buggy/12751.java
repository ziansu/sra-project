public org.json.JSONObject getItem(int position) {
    try {
        return manager.getUuids().getJSONObject(sortIndex.get((position - 1)));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return null;
}