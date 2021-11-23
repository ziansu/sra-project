@java.lang.Override
public void setFieldIntegerNotNull(java.lang.Integer value) {
    realm.checkIfValid();
    if (value == null) {
        throw new java.lang.IllegalArgumentException("Trying to set non-nullable field fieldIntegerNotNull to null.");
    }
    row.setLong(columnInfo.fieldIntegerNotNullIndex, ((long) (value)));
}