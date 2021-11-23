public static java.sql.SQLException newTypeSetConversionException(java.lang.String sourceType, java.lang.String targetType, java.lang.String column, java.lang.Throwable cause) {
    return io.snappydata.thrift.common.ThriftExceptionUtil.newSQLException(SQLState.LANG_DATA_TYPE_SET_MISMATCH, cause, targetType, sourceType, column);
}