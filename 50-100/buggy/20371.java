private void validateLabel(java.lang.String label) {
    int minLength = getPrefixIndexMinLength();
    if ((label != null) & ((label.length()) < minLength)) {
        java.lang.String clazzName = this.getClass().getSimpleName();
        java.lang.String id = this.getId().toString();
        throw DatabaseException.fatals.fieldLengthTooShort(clazzName, id, com.emc.storageos.db.client.model.DataObject.READ_LABEL_METHOD_NAME, label.length(), minLength);
    }
}