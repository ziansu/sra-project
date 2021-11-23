private void percentEncode(java.util.Map<java.lang.String, java.lang.String> map) {
    map.forEach(( a, b) -> {
        try {
            percentEncode(a);
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            percentEncode(b);
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    });
}