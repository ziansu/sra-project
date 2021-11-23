public java.lang.String getReturningType() {
    return signature.substring(((signature.indexOf(":")) + 1), signature.length());
}