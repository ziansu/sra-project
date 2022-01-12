private org.apache.kafka.common.record.MemoryRecordsBuilder recordsBuilder(java.nio.ByteBuffer buffer, byte maxUsableMagic) {
    if (((transactionState) != null) && (maxUsableMagic < (org.apache.kafka.common.record.RecordBatch.MAGIC_VALUE_V2))) {
        throw new org.apache.kafka.common.errors.UnsupportedVersionException(("Attempting to use idempotence with a broker which does not " + "support the required message format (v2). The broker must be version 0.11 or later."));
    }
    return org.apache.kafka.common.record.MemoryRecords.builder(buffer, maxUsableMagic, compression, TimestampType.CREATE_TIME, 0L);
}