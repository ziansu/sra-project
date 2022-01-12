public org.json.simple.JSONArray detectTopicSingular(java.lang.String text) {
    java.util.Map<java.lang.String, org.json.simple.JSONArray> request = requestTopics(text);
    org.json.simple.JSONArray result = null;
    for (java.util.Map.Entry<java.lang.String, org.json.simple.JSONArray> m : request.entrySet())
        result = m.getValue();
    
    return result;
}