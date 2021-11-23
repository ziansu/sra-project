public static java.lang.String toJson(java.lang.Object obj) {
    try {
        com.google.gson.Gson gson = new com.google.gson.GsonBuilder().serializeNulls().create();
        java.lang.String result = gson.toJson(obj);
        return result;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}