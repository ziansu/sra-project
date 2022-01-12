private java.lang.String[] tokens(java.lang.String prefix, int count) {
    java.lang.String[] result = new java.lang.String[count];
    for (int i = 0; i < count; i++) {
        result[i] = prefix + (i + 1);
    }
    return result;
}