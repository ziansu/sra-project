public void putLongArray(final long[] data) {
    int l = (data.length) * (com.heerbann.unsafe.UnsafeBuffer.sizeOfLong);
    putInt(l);
    ensure(((position) + l));
    com.heerbann.unsafe.UnsafeBuffer.unsafe.copyMemory(com.heerbann.unsafe.UnsafeBuffer.toAddress(data), ((pointer) + (position)), l);
    position += l;
    end = ((position) > (end)) ? position : end;
}