public java.lang.Object get(java.lang.String key) throws blade.kit.json.JSONException {
    if (key == null) {
        throw new blade.kit.json.JSONException("Null key.");
    }
    java.lang.Object object = super.get(key);
    if (object == null) {
        throw new blade.kit.json.JSONException((("JSONObject[" + (blade.kit.json.JSONObject.quote(key))) + "] not found."));
    }
    return object;
}