public org.vertx.java.core.json.JsonObject mapToJson(java.lang.Object[] values) {
    org.vertx.java.core.json.JsonObject ret = new org.vertx.java.core.json.JsonObject();
    for (int i = 0; i < (fields.length); i++) {
        java.lang.String field = fields[i];
        int pt = field.indexOf('.');
        if (pt != (-1)) {
            field = field.substring((pt + 1));
        }
        ret.putValue(field, values[i]);
    }
    return ret;
}