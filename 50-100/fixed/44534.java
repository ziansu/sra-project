protected org.json.JSONObject checkExistLengthAndPut(java.lang.String searchField, org.json.JSONObject ConditionObject, org.json.JSONObject receiver, java.lang.String key, int threshold) {
    org.json.JSONObject temp = receiver;
    if (ConditionObject.has(searchField)) {
        if ((ConditionObject.getJSONArray(searchField).length()) > threshold) {
            temp.put(key, new java.lang.String(ConditionObject.getJSONArray(searchField).getString(threshold)));
        }
    }
    return temp;
}