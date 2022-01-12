@java.lang.Override
public com.google.gson.JsonElement serialize(com.hoten.gridia.map.Tile tile, java.lang.reflect.Type type, com.google.gson.JsonSerializationContext jsc) {
    com.google.gson.JsonObject obj = new com.google.gson.JsonObject();
    obj.addProperty("floor", tile.floor);
    obj.add("item", jsc.serialize(tile.item));
    if (((tile.cre) != null) && (!(tile.cre.getBoolean("belongsToPlayer")))) {
        obj.add("cre", jsc.serialize(tile.cre));
    }
    return obj;
}