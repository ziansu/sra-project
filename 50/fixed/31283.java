@java.lang.Override
public void setFieldByteNotNull(java.lang.Byte value) {
    realm.checkIfValid();
    if (value == null) {
        throw new java.lang.IllegalArgumentException("Trying to set non-nullable field fieldByteNotNull to null.");
    }
    row.setLong(columnInfo.fieldByteNotNullIndex, value);
}