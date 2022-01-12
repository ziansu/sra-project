protected java.lang.String replaceResponse(java.lang.String dynamicResponse) {
    java.lang.String response = getResponseTemplate().replace("\\$dynamic_response\\$", dynamicResponse);
    java.util.Set<java.lang.String> slotKeys = slots.keySet();
    for (java.lang.String key : slotKeys) {
        java.lang.String value = slots.get(key).getValue();
        response = response.replaceAll((("\\$" + key) + "\\$"), value);
    }
    return response;
}