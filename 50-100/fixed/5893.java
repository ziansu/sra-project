public static void asJson(cworks.json.JsonArray array, java.io.File output, boolean pretty) throws cworks.json.JsonException {
    cworks.json.Json.throwIfNull(array);
    cworks.json.Json.throwIfNull(output);
    if (pretty) {
        cworks.json.Json.prettyIO().asJson(array, output);
        return ;
    }
    cworks.json.Json.io().asJson(array, output);
}