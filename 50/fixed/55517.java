protected org.json.JSONObject checkExistsAndPut(boolean condition, java.lang.String searchField, org.json.JSONObject ConditionObject, org.json.JSONObject receiver, java.lang.String key, java.lang.Object value) {
    org.json.JSONObject temp = receiver;
    if (condition) {
        temp.put(key, value);
    }
    return temp;
}