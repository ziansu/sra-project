@java.lang.Override
public void call(java.lang.Object... args2) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = ((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) (args2[0]));
    headers.put("Cookie", java.util.Arrays.asList(cookie));
    headers.put("Origin", url);
}