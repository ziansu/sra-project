public static void testDecimalFormat() {
    java.lang.String json = "";
    java.text.DecimalFormat d = new java.text.DecimalFormat("[1\\s+]");
    com.google.gson.Gson gson = TestGenerator.ArgumentCache.UniversalTypeAdapterFactory.buildGson(d);
    json = gson.toJson(d);
    java.lang.System.out.println(json);
    java.text.DecimalFormat _df = gson.fromJson(json, d.getClass());
}