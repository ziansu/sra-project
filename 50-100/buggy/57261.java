private <T> T fromJson(java.lang.Class<T> type, java.lang.String json) throws java.io.IOException {
    @java.lang.SuppressWarnings(value = "unchecked")
    com.squareup.moshi.JsonAdapter<T> jsonAdapter = ((com.squareup.moshi.JsonAdapter<T>) (ClassJsonAdapter.FACTORY.create(type, com.squareup.moshi.Util.NO_ANNOTATIONS, moshi)));
    com.squareup.moshi.JsonReader jsonReader = new com.squareup.moshi.JsonReader(json);
    return jsonAdapter.fromJson(jsonReader);
}