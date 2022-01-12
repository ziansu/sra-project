@java.lang.Override
@net.openhft.chronicle.core.annotation.ForceInline
public void write(long offsetInRDO, @org.jetbrains.annotations.NotNull
java.nio.ByteBuffer bytes, int offset, int length) {
    if (bytes.isDirect()) {
        memory.copyMemory(((((sun.nio.ch.DirectBuffer) (bytes)).address()) + offset), ((address) + (translate(offsetInRDO))), length);
    }else {
        memory.copyMemory(bytes.array(), offset, ((address) + (translate(offsetInRDO))), length);
    }
}