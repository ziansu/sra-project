private java.lang.String generateKey() {
    java.lang.String key = "";
    for (int i = 0, j = 8; i < j; i++) {
        int temp = ((int) (java.lang.Math.floor(((java.lang.Math.random()) * 10))));
        key += temp;
    }
    return key;
}