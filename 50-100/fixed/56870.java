public static <T> void asJson(java.lang.Object[] objects, java.lang.Class<T> arrayType, java.io.File output, boolean pretty) throws cworks.json.JsonException {
    cworks.json.Json.throwIfNull(objects);
    cworks.json.Json.throwIfNull(arrayType);
    cworks.json.Json.throwIfNull(output);
    if (pretty) {
        cworks.json.Json.prettyIO().asJson(objects, arrayType, output);
        return ;
    }
    cworks.json.Json.io().asJson(objects, arrayType, output);
}