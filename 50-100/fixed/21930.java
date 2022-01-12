private boolean isAcceptedAttribute(java.lang.Object key) {
    if ((acceptedAttributeNameRegex) == null) {
        return true;
    }
    if (!(key instanceof java.lang.String)) {
        return true;
    }
    return acceptedAttributeNameRegex.matcher(((java.lang.String) (key))).matches();
}