private java.util.List<java.util.List<java.lang.String>> transformToList(java.util.List<java.lang.String> sentences) {
    java.util.List<java.util.List<java.lang.String>> out = new java.util.ArrayList<>();
    for (java.lang.String s : sentences) {
        out.add(java.util.Arrays.asList(s.split(" ")));
    }
    return out;
}