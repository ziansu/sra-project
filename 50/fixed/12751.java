public org.json.JSONObject getItem(int position) {
    try {
        return manager.getUuids().getJSONObject(sortIndex.get(position));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return null;
}