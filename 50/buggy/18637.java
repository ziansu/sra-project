public java.lang.Object get(int index) throws blade.kit.json.JSONException {
    java.lang.Object object = this.get(index);
    if (object == null) {
        throw new blade.kit.json.JSONException((("JSONArray[" + index) + "] not found."));
    }
    return object;
}