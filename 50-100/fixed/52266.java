private java.lang.String parse(java.lang.String jsonLine) {
    try {
        com.google.gson.JsonElement jelement = new com.google.gson.JsonParser().parse(jsonLine);
        com.google.gson.JsonObject jobject = jelement.getAsJsonObject();
        com.google.gson.JsonArray jarray = jobject.getAsJsonArray("data");
        jobject = jarray.get(0).getAsJsonObject();
        com.google.gson.JsonObject jobject2 = jobject.getAsJsonObject("attributes");
        return jobject2.get("markdown").toString();
    } catch (java.lang.Exception e) {
        return context.getString(R.string.not_a_valid_website);
    }
}