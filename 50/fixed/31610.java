@java.lang.Override
public void setFieldFloatNotNull(java.lang.Float value) {
    realm.checkIfValid();
    if (value == null) {
        throw new java.lang.IllegalArgumentException("Trying to set non-nullable field fieldFloatNotNull to null.");
    }
    row.setFloat(columnInfo.fieldFloatNotNullIndex, value);
}