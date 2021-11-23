public void insertTable(org.json.simple.JSONObject table) {
    org.json.simple.JSONObject newCollection = new org.json.simple.JSONObject();
    newCollection.put("collectionName", table.get("name"));
    org.json.simple.JSONArray collectionData = new org.json.simple.JSONArray();
    collectionData = ((org.json.simple.JSONArray) (table.get("data")));
    newCollection.put("values", collectionData);
    org.json.simple.JSONArray array = ((org.json.simple.JSONArray) (mapped.get("collections")));
    array.add(newCollection);
    mapped.put("collections", array);
}