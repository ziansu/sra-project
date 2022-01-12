public <T> T read(final java.lang.String content, final java.lang.Class<T> type) throws com.google.gson.JsonSyntaxException {
    try {
        return this.mapper.fromJson(content, type);
    } catch (com.google.gson.JsonSyntaxException e) {
        timber.log.Timber.e((((("Error mapping json to class '" + type) + "' with contents: '") + content) + "'"));
        throw e;
    }
}