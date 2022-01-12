@java.lang.Override
public synchronized void write(byte[] record) throws java.lang.InterruptedException, org.apache.hive.hcatalog.streaming.SerializationError, org.apache.nifi.processors.hive.WriteFailure {
    try {
        if ((generateWriteFailure) && (((generateWriteFailureRecordIndex) == null) || ((writeAttemptCount) == (generateWriteFailureRecordIndex)))) {
            throw new org.apache.nifi.processors.hive.WriteFailure(endPoint, 1L, new java.lang.Exception());
        }
        if (generateSerializationError) {
            throw new org.apache.hive.hcatalog.streaming.SerializationError("Test Serialization Error", new java.lang.Exception());
        }
        (totalRecords)++;
    } finally {
        (writeAttemptCount)++;
    }
}