protected org.json.JSONObject checkExistLengthAndPut(java.lang.String searchField, org.json.JSONObject ConditionObject, org.json.JSONObject receiver, java.lang.String key, int threshold) {
    if (ConditionObject.has(searchField)) {
        if ((ConditionObject.getJSONArray(searchField).length()) > threshold) {
            receiver.put(key, new java.lang.String(ConditionObject.getJSONArray(searchField).getString(threshold)));
        }
    }
    return receiver;
}