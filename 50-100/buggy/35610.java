public void putShortArray(final short[] data, boolean length) {
    int l = (data.length) * (com.heerbann.unsafe.UnsafeBuffer.sizeOfShort);
    if (length)
        putInt(l);
    
    ensure(((position) + l));
    com.heerbann.unsafe.UnsafeBuffer.unsafe.copyMemory(data, com.heerbann.unsafe.UnsafeBuffer.shortArrayOffset, null, ((pointer) + (position)), l);
    position += l;
    end = ((position) > (end)) ? position : end;
}