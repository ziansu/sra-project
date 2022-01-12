public static <T> void asJson(java.lang.Object[] objects, java.lang.Class<T> objectType, java.nio.file.Path output, boolean pretty) throws cworks.json.JsonException {
    cworks.json.Json.throwIfNull(objects);
    cworks.json.Json.throwIfNull(objectType);
    cworks.json.Json.throwIfNull(output);
    if (pretty) {
        cworks.json.Json.prettyIO().asJson(objects, objectType, output);
    }
    cworks.json.Json.io().asJson(objects, objectType, output);
}