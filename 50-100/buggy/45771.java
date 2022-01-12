public void putDoubleArray(final double[] data, boolean length) {
    int l = (data.length) * (com.heerbann.unsafe.UnsafeBuffer.sizeOfDouble);
    if (length)
        putInt(l);
    
    ensure(((position) + l));
    com.heerbann.unsafe.UnsafeBuffer.unsafe.copyMemory(data, com.heerbann.unsafe.UnsafeBuffer.doubleArrayOffset, null, ((pointer) + (position)), l);
    position += l;
    end = ((position) > (end)) ? position : end;
}