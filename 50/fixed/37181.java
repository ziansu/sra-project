public java.lang.String getBase64() {
    if ((base64) == "") {
        base64 = new java.lang.String(java.util.Base64.getEncoder().encode(bytes));
    }
    return base64;
}