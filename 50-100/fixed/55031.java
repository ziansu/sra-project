@java.lang.Override
public void startWrite() {
    writeOffset = 0;
    lastWriteIndex = 0;
    if ((capacity) < (org.apache.drill.exec.vector.accessor.ColumnAccessors.MIN_BUFFER_SIZE)) {
        vector.reallocRaw(ColumnAccessors.MIN_BUFFER_SIZE);
    }
    setAddr(vector.getBuffer());
    io.netty.util.internal.PlatformDependent.putInt(bufAddr, writeOffset);
}