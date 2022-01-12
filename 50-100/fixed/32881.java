public static void asJson(cworks.json.JsonObject object, java.io.File output, boolean pretty) throws cworks.json.JsonException {
    cworks.json.Json.throwIfNull(object);
    cworks.json.Json.throwIfNull(output);
    if (pretty) {
        cworks.json.Json.prettyIO().asJson(object, output);
        return ;
    }
    cworks.json.Json.io().asJson(object, output);
}