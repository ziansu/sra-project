private java.util.Iterator<?> parseResponse(java.util.Map<java.lang.String, java.lang.Object> responseOutput) {
    try {
        fillResponseOutput(keysToObjectList, responseOutput, reader);
        @java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
        com.quantium.mobile.framework.JsonToObjectIterator iter = new com.quantium.mobile.framework.JsonToObjectIterator(reader, prototype);
        return iter;
    } catch (org.json.JSONException e) {
        com.quantium.mobile.framework.logging.LogPadrao.e(e);
        throw new java.lang.RuntimeException(e);
    }
}