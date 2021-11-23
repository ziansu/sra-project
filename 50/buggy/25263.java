@java.lang.Override
public void serialize(java.lang.Object value, java.nio.ByteBuffer out) {
    int id = dictionary.getIdFromValue(value);
    org.apache.kylin.common.util.BytesUtil.writeUnsigned(id, dictionary.getSizeOfId(), out);
}