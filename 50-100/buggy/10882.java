public <T> T read(final java.io.InputStream content, final java.lang.Class<T> type) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
    try {
        return this.mapper.fromJson(new java.io.InputStreamReader(content), type);
    } catch (com.google.gson.JsonIOException | com.google.gson.JsonSyntaxException e) {
        timber.log.Timber.e(e, (((("Error mapping json to class '" + type) + "' with contents: '") + content) + "'"));
        throw e;
    }
}