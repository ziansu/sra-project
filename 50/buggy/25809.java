@java.lang.Override
public boolean evaluate(org.apache.spark.sql.catalyst.InternalRow row) {
    return (!(row.isNullAt(ordinal))) && (value.equals(row.getUTF8String(ordinal)));
}