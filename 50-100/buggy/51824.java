public static void asJson(java.lang.Object object, java.io.File output, boolean pretty) throws cworks.json.JsonException {
    cworks.json.Json.throwIfNull(object);
    cworks.json.Json.throwIfNull(output);
    if (pretty) {
        cworks.json.Json.prettyIO().asJson(object, output);
    }
    cworks.json.Json.io().asJson(object, output);
}