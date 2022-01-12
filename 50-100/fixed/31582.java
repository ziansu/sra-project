private org.json.JSONArray extractNamespaces() throws org.json.JSONException {
    org.json.JSONArray jsonNamespaces = new org.json.JSONArray();
    for (java.lang.String namespace : mNamespaces) {
        org.json.JSONObject jsonNamespace = new org.json.JSONObject();
        jsonNamespace.put("name", namespace);
        jsonNamespaces.put(jsonNamespace);
    }
    return jsonNamespaces;
}