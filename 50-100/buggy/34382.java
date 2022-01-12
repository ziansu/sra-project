public org.json.JSONArray getFollowersProfiling(java.lang.String name) {
    java.util.List<java.lang.Number> followers = getFollowers(name);
    org.json.JSONArray result = new org.json.JSONArray();
    for (java.lang.Number id : followers) {
        org.json.JSONObject profiling = getUserProfiling(id);
        if (profiling != null) {
            result.put(getUserProfiling(id));
        }
    }
    return result;
}