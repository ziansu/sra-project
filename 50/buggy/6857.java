@java.lang.Override
public void setFieldFloatNull(java.lang.Float value) {
    realm.checkIfValid();
    if (value == null) {
        row.setNull(columnInfo.fieldFloatNullIndex);
        return ;
    }
    row.setFloat(columnInfo.fieldFloatNullIndex, ((float) (value)));
}