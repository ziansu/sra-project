public void putIntArray(final int[] data, boolean length) {
    int l = data.length;
    if (length)
        putInt(l);
    
    l *= com.heerbann.unsafe.UnsafeBuffer.sizeOfInt;
    ensure(((position) + l));
    com.heerbann.unsafe.UnsafeBuffer.unsafe.copyMemory(data, com.heerbann.unsafe.UnsafeBuffer.intArrayOffset, null, ((pointer) + (position)), l);
    position += l;
    end = ((position) > (end)) ? position : end;
}