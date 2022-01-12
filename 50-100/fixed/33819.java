@java.lang.Override
public com.bendb.thrifty.protocol.MapMetadata readMapBegin() throws java.io.IOException {
    byte keyTypeId = readByte();
    byte valueTypeId = readByte();
    int size = readI32();
    if (((containerLengthLimit) != (-1)) && (size > (containerLengthLimit))) {
        throw new java.net.ProtocolException("Container size limit exceeded");
    }
    return new com.bendb.thrifty.protocol.MapMetadata(keyTypeId, valueTypeId, size);
}