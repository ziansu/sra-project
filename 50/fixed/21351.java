public java.lang.String getExpiryMonth() {
    if ((java.lang.Integer.valueOf(expMonth)) < 10) {
        return "0" + (java.lang.String.valueOf(java.lang.Integer.valueOf(expMonth)));
    }
    return java.lang.String.valueOf(expMonth);
}