@java.lang.Override
public com.google.gson.JsonObject call(java.lang.String s) {
    try {
        return jsonParser.parse(s.trim()).getAsJsonObject();
    } catch (com.google.gson.JsonSyntaxException e) {
        android.util.Log.d("sfparks parksModule", ((("poorly formed json: " + s) + " Error: ") + e));
        return null;
    }
}