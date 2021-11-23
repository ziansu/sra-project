private java.lang.Long captchaHashCalculation(java.lang.String value) {
    int hash = 5381;
    value = value.toUpperCase();
    for (int i = 0; i < (value.length()); i++) {
        hash = ((hash << 5) + hash) + (value.charAt(i));
    }
    return java.lang.Long.valueOf(hash);
}