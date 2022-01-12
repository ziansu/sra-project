public static void asJson(cworks.json.JsonArray array, java.io.Writer output, boolean pretty) throws cworks.json.JsonException {
    cworks.json.Json.throwIfNull(array);
    cworks.json.Json.throwIfNull(output);
    if (pretty) {
        cworks.json.Json.prettyIO().asJson(array, output);
    }
    cworks.json.Json.io().asJson(array, output);
}