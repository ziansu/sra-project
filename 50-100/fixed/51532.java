private com.google.gson.JsonArray toJson(mil.nga.wkb.geom.Polygon polygon) {
    com.google.gson.JsonArray result = new com.google.gson.JsonArray();
    result.add(toJson(polygon.getRings().get(0)));
    for (int i = 1; i < (polygon.numRings()); i++) {
        result.add(toJson(polygon.getRings().get(i)));
    }
    return result;
}