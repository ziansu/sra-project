java.lang.String processSubFieldsOfArg(java.lang.String[] path, java.lang.String jsonArg) {
    try (javax.json.JsonReader reader = javax.json.Json.createReader(new java.io.StringReader(jsonArg))) {
        javax.json.JsonValue jsonObject = reader.readObject();
        for (java.lang.String p : path) {
            logger.debug("Access to '{}' for '{}'", p, jsonObject);
            jsonObject = ((javax.json.JsonObject) (jsonObject)).get(p);
        }
        return jsonObject.toString();
    }
}