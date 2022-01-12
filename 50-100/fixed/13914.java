public static void asJson(java.lang.Object[] objects, java.io.OutputStream output, boolean pretty) throws cworks.json.JsonException {
    cworks.json.Json.throwIfNull(objects);
    cworks.json.Json.throwIfNull(output);
    if (pretty) {
        cworks.json.Json.prettyIO().asJson(objects, output);
        return ;
    }
    cworks.json.Json.io().asJson(objects, output);
}