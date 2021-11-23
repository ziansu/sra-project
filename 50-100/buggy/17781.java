@org.jetbrains.annotations.NotNull
public net.openhft.chronicle.bytes.Bytes<Underlying> append8bit(@org.jetbrains.annotations.NotNull
java.lang.CharSequence cs) throws java.nio.BufferOverflowException, java.nio.BufferUnderflowException, net.openhft.chronicle.core.io.IORuntimeException {
    if (cs instanceof net.openhft.chronicle.bytes.BytesStore)
        return write(((net.openhft.chronicle.bytes.BytesStore) (cs)));
    
    if (((bytesStore) instanceof net.openhft.chronicle.bytes.NativeBytesStore) && (cs instanceof java.lang.String))
        return append8bitNBS_S(((net.openhft.chronicle.bytes.NativeBytesStore) (bytesStore)), ((java.lang.String) (cs)));
    
    return append8bit0(cs);
}