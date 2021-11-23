public static java.lang.String listToString(java.util.List<java.lang.String> list) {
    java.lang.StringBuilder Builder = new java.lang.StringBuilder();
    for (java.lang.String out : list) {
        Builder.append(out);
    }
    return Builder.toString();
}