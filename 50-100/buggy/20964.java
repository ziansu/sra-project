private java.lang.String buffer(long number) {
    java.lang.String s = java.lang.Long.toString(number);
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    for (int i = s.length(); i < 12; i++) {
        builder.append('0');
    }
    return builder.append(s).toString();
}