private java.util.Map<java.lang.Integer, java.lang.Double> getCosts(javax.json.JsonArray jsonArray) {
    java.util.Map<java.lang.Integer, java.lang.Double> map = new java.util.HashMap<>();
    for (int i = 0; i < (jsonArray.size()); i++) {
        map.put(i, jsonArray.getJsonNumber(i).doubleValue());
    }
    return map;
}