@java.lang.Override
public void setFieldDoubleNotNull(java.lang.Double value) {
    realm.checkIfValid();
    if (value == null) {
        throw new java.lang.IllegalArgumentException("Trying to set non-nullable field fieldDoubleNotNull to null.");
    }
    row.setDouble(columnInfo.fieldDoubleNotNullIndex, value);
}