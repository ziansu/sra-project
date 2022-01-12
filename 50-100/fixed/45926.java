private java.util.Map<java.lang.String, java.lang.String> percentEncode(java.util.Map<java.lang.String, java.lang.String> map) {
    java.util.Map<java.lang.String, java.lang.String> out = new java.util.HashMap<>();
    map.forEach(( a, b) -> {
        try {
            out.put(percentEncode(a), percentEncode(b));
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    });
    return out;
}