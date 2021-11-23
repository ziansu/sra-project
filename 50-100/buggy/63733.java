private java.util.UUID[] parseServiceUUIDList(org.json.JSONArray jsonArray) throws org.json.JSONException {
    java.util.List<java.util.UUID> serviceUUIDs = new java.util.ArrayList<java.util.UUID>();
    for (int i = 0; i < (jsonArray.length()); i++) {
        java.lang.String uuidString = jsonArray.getString(i);
        serviceUUIDs.add(uuidFromString(uuidString));
    }
    return serviceUUIDs.toArray(new java.util.UUID[jsonArray.length()]);
}