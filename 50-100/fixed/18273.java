public static org.vertx.java.core.json.JsonObject createDeleteDocument(org.vertx.java.core.json.JsonObject deleteQuery, java.lang.String collection, boolean justOne) {
    org.vertx.java.core.json.JsonObject delete = new org.vertx.java.core.json.JsonObject();
    delete.putBoolean("just_one", justOne);
    delete.putString("collection", collection);
    delete.putObject("query", deleteQuery);
    return delete;
}