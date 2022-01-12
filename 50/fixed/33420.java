public static java.lang.String getJson(com.mediamath.terminalone.models.VideoCreative entity) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    return gson.toJson(entity);
}