public java.sql.Timestamp getTimestampOffset() {
    if ((timestampOffset) == null) {
        com.github.jpalomo.connect.cdc.mssqlserver.TimestampOffset.log.trace("Timestamp can never be null");
        return null;
    }
    return timestampOffset;
}