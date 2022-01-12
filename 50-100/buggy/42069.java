public static java.lang.String asJson(cworks.json.JsonObject object, boolean pretty) throws cworks.json.JsonException {
    cworks.json.Json.throwIfNull(object);
    if (pretty) {
        cworks.json.Json.prettyIO().asJson(object);
    }
    return cworks.json.Json.io().asJson(object);
}