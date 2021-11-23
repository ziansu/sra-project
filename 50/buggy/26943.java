@java.lang.Override
public void setFieldByteNull(java.lang.Byte value) {
    realm.checkIfValid();
    if (value == null) {
        row.setNull(columnInfo.fieldByteNullIndex);
        return ;
    }
    row.setLong(columnInfo.fieldByteNullIndex, ((long) (value)));
}