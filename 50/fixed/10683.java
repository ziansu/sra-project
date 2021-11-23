java.lang.String preprocess(java.lang.String line) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    stripComment(line, 0, builder);
    return builder.toString();
}