private java.util.Map<java.lang.String, java.lang.Object> jsonToMap(org.json.JSONObject json) throws org.json.JSONException {
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<java.lang.String, java.lang.Object>();
    java.util.Iterator<?> i = json.keys();
    while (i.hasNext()) {
        java.lang.String key = ((java.lang.String) (i.next()));
        java.lang.Object o = json.get(key);
        result.put(key, o);
    } 
    return result;
}