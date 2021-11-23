public static void asJson(cworks.json.JsonElement element, java.nio.file.Path output, boolean pretty) throws cworks.json.JsonException {
    cworks.json.Json.throwIfNull(element);
    cworks.json.Json.throwIfNull(output);
    if (pretty) {
        cworks.json.Json.prettyIO().asJson(element, output);
        return ;
    }
    cworks.json.Json.io().asJson(element, output);
}