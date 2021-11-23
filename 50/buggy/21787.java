@java.lang.Override
public void setFieldIntegerNull(java.lang.Integer value) {
    realm.checkIfValid();
    if (value == null) {
        row.setNull(columnInfo.fieldIntegerNullIndex);
        return ;
    }
    row.setLong(columnInfo.fieldIntegerNullIndex, ((long) (value)));
}