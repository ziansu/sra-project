@java.lang.Override
public com.bendb.thrifty.protocol.MapMetadata readMapBegin() throws java.io.IOException {
    int size = readVarint32();
    byte keyAndValueTypes = (size == 0) ? 0 : readByte();
    byte keyType = com.bendb.thrifty.protocol.CompactProtocol.CompactTypes.compactToTtype(((byte) (keyAndValueTypes >> 4)));
    byte valueType = com.bendb.thrifty.protocol.CompactProtocol.CompactTypes.compactToTtype(((byte) (keyAndValueTypes & 15)));
    return new com.bendb.thrifty.protocol.MapMetadata(keyType, valueType, size);
}