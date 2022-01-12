@java.lang.Override
public void startWrite() {
    setAddr(this.vector.getBuffer());
    writeOffset = 0;
    lastWriteIndex = 0;
    if ((capacity) < (org.apache.drill.exec.vector.accessor.ColumnAccessors.MIN_BUFFER_SIZE)) {
        setAddr(this.vector.reallocRaw(ColumnAccessors.MIN_BUFFER_SIZE));
    }
    io.netty.util.internal.PlatformDependent.putInt(bufAddr, writeOffset);
}