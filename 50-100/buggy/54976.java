private com.github.davidmoten.aws.helper.StandardRequestBodyPassThrough insertContext(java.lang.String key) {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<>();
    map.put("params", params);
    java.util.Map<java.lang.String, java.lang.String> m = new java.util.HashMap<>();
    m.put(key, "thevalue");
    params.put("context", m);
    return com.github.davidmoten.aws.helper.StandardRequestBodyPassThrough.from(map);
}