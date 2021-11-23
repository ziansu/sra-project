@java.lang.SuppressWarnings(value = "unchecked")
private java.lang.String toJsonArrayAsString(java.lang.Iterable<java.lang.String> items) {
    org.json.simple.JSONArray result = new org.json.simple.JSONArray();
    items.forEach(( item) -> result.add(item));
    return result.toJSONString();
}