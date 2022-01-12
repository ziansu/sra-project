private boolean isAcceptedAttribute(java.lang.Object key) {
    if ((this.acceptedAttributeNameRegex) == null) {
        return true;
    }
    if (!(key instanceof java.lang.String)) {
        return true;
    }
    return this.acceptedAttributeNameRegex.matcher(((java.lang.String) (key))).matches();
}