private java.lang.String getAllFieldsOf(org.json.JSONObject json) {
    java.lang.StringBuilder subClassFields = new java.lang.StringBuilder();
    java.lang.String filedStr = null;
    java.util.Iterator<?> keysIterator = json.keys();
    while (keysIterator.hasNext()) {
        filedStr = getClassFields(json, keysIterator);
        subClassFields.append((filedStr + "\n"));
    } 
    return subClassFields.toString();
}