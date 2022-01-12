public void putLongArray(final long[] data, boolean length) {
    int l = data.length;
    if (length)
        putInt(l);
    
    l *= com.heerbann.unsafe.UnsafeBuffer.sizeOfLong;
    ensure(((position) + l));
    com.heerbann.unsafe.UnsafeBuffer.unsafe.copyMemory(data, com.heerbann.unsafe.UnsafeBuffer.longArrayOffset, null, ((pointer) + (position)), l);
    position += l;
    end = ((position) > (end)) ? position : end;
}