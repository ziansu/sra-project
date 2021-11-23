public java.lang.String getValue() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    int ind = 0;
    for (int i = ind; i < (digits.length); i++) {
        sb.append(digits[i]);
    }
    return sb.toString();
}