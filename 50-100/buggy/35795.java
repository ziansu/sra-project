public static <T> void asJson(java.lang.Object object, java.lang.Class<T> objectType, java.io.File output, boolean pretty) throws cworks.json.JsonException {
    cworks.json.Json.throwIfNull(object);
    cworks.json.Json.throwIfNull(objectType);
    cworks.json.Json.throwIfNull(output);
    if (pretty) {
        cworks.json.Json.prettyIO().asJson(object, objectType, output);
    }
    cworks.json.Json.io().asJson(object, objectType, output);
}