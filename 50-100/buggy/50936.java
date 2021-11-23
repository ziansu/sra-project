public void putFloatArray(final float[] data, boolean length) {
    int l = (data.length) * (com.heerbann.unsafe.UnsafeBuffer.sizeOfFloat);
    if (length)
        putInt(l);
    
    ensure(((position) + l));
    com.heerbann.unsafe.UnsafeBuffer.unsafe.copyMemory(data, com.heerbann.unsafe.UnsafeBuffer.floatArrayOffset, null, ((pointer) + (position)), l);
    position += l;
    end = ((position) > (end)) ? position : end;
}