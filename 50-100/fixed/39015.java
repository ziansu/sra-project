private void insertRooms(org.json.JSONArray array) throws org.json.JSONException {
    mResolver.delete(AtlantisContract.Rooms.CONTENT_URI, null, null);
    for (int i = 0; i < (array.length()); i++) {
        org.json.JSONObject nJson = array.getJSONObject(i);
        android.content.ContentValues nValues = new android.content.ContentValues();
        nValues.put("id", nJson.getInt("id"));
        nValues.put("room", nJson.getString("room"));
        mResolver.insert(AtlantisContract.Rooms.CONTENT_URI, nValues);
    }
}