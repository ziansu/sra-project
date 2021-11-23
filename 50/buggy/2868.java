public static java.lang.String convertToString(java.lang.Object obj) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String json = gson.toJson(obj);
    return json;
}