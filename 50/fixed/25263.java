@java.lang.Override
public void serialize(java.lang.Object value, java.nio.ByteBuffer buf) {
    int id = dictionary.getIdFromValue(value);
    org.apache.kylin.common.util.BytesUtil.writeUnsigned(id, dictionary.getSizeOfId(), buf);
}