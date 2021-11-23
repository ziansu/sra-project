@java.lang.Override
public void setFieldLongNotNull(java.lang.Long value) {
    realm.checkIfValid();
    if (value == null) {
        throw new java.lang.IllegalArgumentException("Trying to set non-nullable field fieldLongNotNull to null.");
    }
    row.setLong(columnInfo.fieldLongNotNullIndex, value);
}