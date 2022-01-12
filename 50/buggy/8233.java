public void setAtPosition(long position, int value) {
    long i = (pointer) + (position * (com.heerbann.unsafe.UnsafeBuffer.sizeOfInt));
    ensure(i);
    com.heerbann.unsafe.UnsafeBuffer.unsafe.putInt(i, value);
}