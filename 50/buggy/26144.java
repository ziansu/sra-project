private static java.lang.String requestJson(java.lang.String json, int type) {
    return (("{\"request_type\":" + (java.lang.String.valueOf(type))) + ",") + (json.substring(1));
}