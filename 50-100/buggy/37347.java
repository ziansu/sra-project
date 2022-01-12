public void putShortArray(final short[] data) {
    int l = (data.length) * (com.heerbann.unsafe.UnsafeBuffer.sizeOfShort);
    putInt(l);
    ensure(((position) + l));
    com.heerbann.unsafe.UnsafeBuffer.unsafe.copyMemory(com.heerbann.unsafe.UnsafeBuffer.toAddress(data), ((pointer) + (position)), l);
    position += l;
}