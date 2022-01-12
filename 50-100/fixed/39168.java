public void putCharArray(final char[] data, boolean length) {
    int l = data.length;
    if (length)
        putInt(l);
    
    l *= com.heerbann.unsafe.UnsafeBuffer.sizeOfChar;
    ensure(((position) + l));
    com.heerbann.unsafe.UnsafeBuffer.unsafe.copyMemory(data, com.heerbann.unsafe.UnsafeBuffer.charArrayOffset, null, ((pointer) + (position)), l);
    position += l;
    end = ((position) > (end)) ? position : end;
}