private java.lang.String getRetailItemValue() {
    java.lang.StringBuilder value = new java.lang.StringBuilder(java.lang.String.valueOf(counter.getAndIncrement()));
    int length = value.length();
    for (int i = 1; i <= (10 - length); i++) {
        value.append("0");
    }
    return value.toString();
}