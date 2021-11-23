public void putCharArray(final char[] data) {
    int l = (data.length) * (com.heerbann.unsafe.UnsafeBuffer.sizeOfChar);
    putInt(l);
    ensure(((position) + l));
    com.heerbann.unsafe.UnsafeBuffer.unsafe.copyMemory(com.heerbann.unsafe.UnsafeBuffer.toAddress(data), ((pointer) + (position)), l);
    position += l;
}