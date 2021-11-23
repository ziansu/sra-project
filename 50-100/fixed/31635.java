private java.lang.String getAllFieldsOf(org.json.JSONObject json) {
    java.lang.StringBuilder subClassFields = new java.lang.StringBuilder();
    java.util.Iterator<?> keysIterator = json.keys();
    while (keysIterator.hasNext()) {
        java.lang.String filedStr = getClassFields(json, keysIterator);
        subClassFields.append(filedStr);
    } 
    return subClassFields.toString();
}