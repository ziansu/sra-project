public java.util.Map<java.lang.String, java.lang.String> headers(final java.util.Map<java.lang.String, java.lang.String> map) {
    if ((getParent()) != null) {
        getParent().getRequest().getEffective().headers(map);
    }
    map.putAll(getHeaders());
    if (!(map.containsKey("Accept"))) {
        map.put("Accept", java.lang.String.join(";", acceptHeader(contentType())));
    }
    return map;
}