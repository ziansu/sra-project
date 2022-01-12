public java.util.Map<java.lang.String, java.lang.Object> getVersion() {
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<>();
    try {
        result.put("error", 0);
        result.put("result", new com.nasimeshomal.lib.Statics().getVersion());
    } catch (java.lang.Exception ex) {
        result.put("error", 1);
        ex.printStackTrace();
    }
    return result;
}