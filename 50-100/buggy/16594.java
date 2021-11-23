@java.lang.Override
public final void setPointer(int offset, org.renjin.gcc.runtime.Ptr value) {
    int byteStart = (this.offset) + offset;
    if ((byteStart % (org.renjin.gcc.runtime.MixedPtr.POINTER_BYTES)) != 0) {
        throw new java.lang.UnsupportedOperationException("Unaligned pointer storage");
    }
    int index = byteStart / (org.renjin.gcc.runtime.MixedPtr.POINTER_BYTES);
    references[index] = value;
    setInt((offset / (org.renjin.gcc.runtime.MixedPtr.POINTER_BYTES)), value.toInt());
}