private java.lang.String getRetailItemValue() {
    java.lang.StringBuffer value = new java.lang.StringBuffer(java.lang.String.valueOf(counter.getAndIncrement()));
    int length = value.length();
    for (int i = 1; i <= (10 - length); i++) {
        value.append("0");
    }
    return value.toString();
}