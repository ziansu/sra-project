@java.lang.Override
public void read(org.apache.spark.sql.Row row, int ordinal) throws com.splicemachine.db.iapi.error.StandardException {
    if ((row.isNullAt(ordinal)) || ((value) == null))
        value = new com.splicemachine.db.iapi.types.SQLRowId();
    
    value.read(row, ordinal);
}