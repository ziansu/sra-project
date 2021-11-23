@java.lang.Override
public void setFieldBooleanNotNull(java.lang.Boolean value) {
    realm.checkIfValid();
    if (value == null) {
        throw new java.lang.IllegalArgumentException("Trying to set non-nullable field fieldBooleanNotNull to null.");
    }
    row.setBoolean(columnInfo.fieldBooleanNotNullIndex, value);
}