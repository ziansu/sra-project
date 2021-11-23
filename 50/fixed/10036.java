public static org.apache.kafka.common.utils.Bytes wrap(byte[] bytes) {
    if (bytes == null)
        return null;
    
    return new org.apache.kafka.common.utils.Bytes(bytes);
}