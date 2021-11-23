@java.lang.Override
public void setFieldLongNull(java.lang.Long value) {
    realm.checkIfValid();
    if (value == null) {
        row.setNull(columnInfo.fieldLongNullIndex);
        return ;
    }
    row.setLong(columnInfo.fieldLongNullIndex, ((long) (value)));
}