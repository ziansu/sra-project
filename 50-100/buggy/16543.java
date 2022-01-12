public static org.apache.kafka.common.record.ControlRecordType parse(java.nio.ByteBuffer key) {
    short version = key.getShort(0);
    if (version != (org.apache.kafka.common.record.ControlRecordType.CURRENT_CONTROL_RECORD_KEY_VERSION))
        org.apache.kafka.common.record.ControlRecordType.log.debug(("Received unknown control record key version {}. Parsing as version {}" + version), org.apache.kafka.common.record.ControlRecordType.CURRENT_CONTROL_RECORD_KEY_VERSION);
    
    short type = key.getShort(2);
    switch (type) {
        case 0 :
            return org.apache.kafka.common.record.ControlRecordType.ABORT;
        case 1 :
            return org.apache.kafka.common.record.ControlRecordType.COMMIT;
        default :
            return org.apache.kafka.common.record.ControlRecordType.UNKNOWN;
    }
}