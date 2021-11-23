public java.lang.String getValue() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    int ind = (digits.length) - 1;
    while ((digits[ind]) == 0) {
        ind--;
    } 
    for (int i = ind; i >= 0; i--) {
        sb.append(digits[i]);
    }
    return sb.toString();
}