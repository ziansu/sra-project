public java.lang.String isStorageAccountNameReferenceTypeEquals(final java.lang.String type) {
    if (((this.storageAccountNameReferenceType) == null) && (type.equalsIgnoreCase("new"))) {
        return "true";
    }
    return (type != null) && (type.equalsIgnoreCase(this.storageAccountNameReferenceType)) ? "true" : "false";
}