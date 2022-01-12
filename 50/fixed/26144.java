private static java.lang.String requestJson(java.lang.String json, int type) {
    return (("{\"request_type\":" + type) + ",") + (json.substring(1));
}