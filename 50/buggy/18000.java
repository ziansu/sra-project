@java.lang.Override
public void toJsonObject(org.json.JSONObject object, java.lang.String key, T value) throws org.json.JSONException {
    object.put(key, mParser.toJson(value));
}